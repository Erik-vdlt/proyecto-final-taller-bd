/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import modelo.*;
import modelo.Prestamo;

/**
 *
 * @author erik
 */
public class PrestamoDAO {
    
    private final String TABLA = "prestamo";
    
    public PrestamoDAO(){
        
    }
    
    public boolean agregarPrestamo(Prestamo p,conexionBD c){
        String sql = "INSERT INTO prestamo VALUES("
	+p.getId_libro_prestamo()+","
        +p.getId_lector_prestamo()+",'"
        +p.getFecha_prestamo()+"','"
        +p.getFecha_devolucion()+"','"
        +p.isMulta()+"')";
        
        return c.ejecutarInstruccionSQL(sql);
    }
    
    public void eliminarPrestamo(int clave,int clave1,conexionBD c){
        String sql = "DELETE FROM prestamo WHERE libro_id = "+clave+" and "+"lector_id = "+clave1;
        
        c.ejecutarInstruccionSQL(sql);
    }
     
    public boolean modificarPrestamo(Prestamo prestamo,conexionBD conexion) {
		
	String sql = "UPDATE prestamo SET libro_id ="+prestamo.getId_libro_prestamo()
	+",lector_id="+prestamo.getId_lector_prestamo()
	+",fecha_prestamo='"+prestamo.getFecha_prestamo()
	+"',fecha_devolucion='"+prestamo.getFecha_devolucion()
	+"',multa='"+prestamo.isMulta()
        +"' where libro_id = "+prestamo.getId_libro_prestamo()+" and lector_id = "+prestamo.getId_lector_prestamo();
		
		
	return conexion.ejecutarInstruccionSQL(sql);
    }
    
    public Prestamo ModificaPrestamo(int id,int id1,conexionBD conexion) {
	Prestamo p = null;

        String instruccionSQL = "SELECT * FROM prestamo WHERE libro_id = "+id+" and lector_id = "+id1;
        ResultSet rs = conexion.consultarRegistros(instruccionSQL);
        //ResultSet rs = conexion.consultarRegistros(id,id);
        try{
            if(rs.first()){
                p = new Prestamo(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5));
            }
           // conexion.cerrarConexion();
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return  p;
    }
    
    public boolean consultaLector(String clave,String valor,JTable tabla,conexionBD conexion){
        boolean completo = false;

        DefaultTableModel modelo = new DefaultTableModel();
      //  ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE "+clave+" = '"+valor+"'");
        ResultSet rs = conexion.consultarRegistrosMultiples(clave,valor,TABLA);
        //ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE "+clave+" = "+valor);
        //ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE IdLector = '"+valor+"'");
        modelo.setColumnIdentifiers( new Object[] {
                "Id Libro", "Titulo", "Editorial","Año", "ISBN", "Tipo Libro","Genero"});


        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)});
                completo = true;
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
            completo = false;
        }
        return  completo;
    }
    
    public void vista(conexionBD co,JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        
        String vista = "select * from vista_prestamo_libro";
        
        ResultSet rs = co.consultarAvanzada(vista);
        
        modelo.setColumnIdentifiers( new Object[] {
                "lector_id","fecha_prestamo","fecha_devolucion","titulo","editorial","year"});


        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)});
                //completo = true;
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void busquedaAvanzada(ArrayList atributos,ArrayList filtros,conexionBD co,JTable tabla){
        String cad = atributos.toString();
        cad = cad.replace("[", " ");
        cad = cad.replace("]", " ");
        boolean completo = false;
        //+cad+
        String instruccionSQL = "select "+cad+" from prestamo"
                +" inner join libro on "+filtros.get(0)+" and "+filtros.get(1);
        
        ResultSet rs = co.consultarAvanzada(instruccionSQL);
        Object columnas[] = new Object[atributos.size()];
        for (int i = 0; i < atributos.size(); i++) {
            columnas[i]= atributos.get(i);
            
        }
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers( columnas);
        //"Libro Id", "Lector Id", "Fecha Prestamo","Fecha Devolucion", "Multa", "Titulo","Editorial",
          //      "Año","ISBN","Tipo Libro","Genero"
        Object filas[] = new Object[modelo.getColumnCount()];
          
        
        int count = 1;
        try{
            while(rs.next()){
                for (int i = 0; i < filas.length; i++) {
                    filas[i] = rs.getString(i+1);
                }
                modelo.addRow(filas);
               // modelo.addRow(new Object[]{
                 //  rs.getString(count),
                        /*rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)*///});
                completo = true;
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
            completo = false;
        }
        
        System.out.println("instruccionSQL --> "+instruccionSQL);
        
    }
    
    
    
}
