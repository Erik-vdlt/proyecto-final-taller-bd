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

/**
 *
 * @author erik
 */
public class PrestamoDAO {
    
    public PrestamoDAO(){
        
    }
    
    public void busquedaAvanzada(ArrayList atributos,ArrayList filtros,conexionBD co,JTable tabla){
        String cad = atributos.toString();
        cad = cad.replace("[", " ");
        cad = cad.replace("]", " ");
        boolean completo = false;
        //+cad+
        String instruccionSQL = "select "+cad+" from prestamo"
                +" inner join libro on "+filtros.get(0)+" and "+filtros.get(1);
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = co.consultarAvanzada(instruccionSQL);
        
        modelo.setColumnIdentifiers( new Object[] {
                "Libro Id", "Lector Id", "Fecha Prestamo","Fecha Devolucion", "Multa", "Titulo","Editorial",
                "Año","ISBN","Tipo Libro","Genero"});
        
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)});
                completo = true;
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
            completo = false;
        }
        
        System.out.println("instruccionSQL --> "+instruccionSQL);
        
    }
    
    public ArrayList buscarAlumnosList(ArrayList atributos,ArrayList filtros,conexionBD co) {
        ArrayList listaAlumnos = new ArrayList();
                
        String cad = atributos.toString();
        cad = cad.replace("[", " ");
        cad = cad.replace("]", " ");
        boolean completo = false;
        //+cad+
        String instruccionSQL = "select * from prestamo"
                +" inner join libro on "+filtros.get(0)+" and "+filtros.get(1);
		
		//RECORRER el ResultSet mientras haya registros
		//SELECT * FROM alumnos;
		
		//rs.first()
		
		//String sql = "SELECT * FROM Alumnos WHERE numControl="+filtro+";";
		//conexionBD conexion = new conexionBD();
		ResultSet rs = co.consultarRegistros(instruccionSQL);
		
		
		try {
			rs.first();
			while(!rs.isAfterLast()) {
				Libro libro = new Libro();
                                Prestamo prestamo = new Prestamo();
				/*alumno.setNumControl(rs.getString(1));
				alumno.setNombre(rs.getString(2));
				alumno.setPrimerAp(rs.getString(3));
				alumno.setSegundoAp(rs.getString(4));
				alumno.setEdad(rs.getByte(5));
				alumno.setSemestre(rs.getByte(6));
				alumno.setCarrera(rs.getString(7));*/
                                libro.setId_libro(rs.getInt(1));
                                libro.setTitulo(rs.getString(2));
                                libro.setEditorial(rs.getString(3));
                                libro.setFecha(rs.getString(4));
                                libro.setISBN(rs.getString(5));
                                libro.setTipoLibro(rs.getString(6));
                                libro.setGenero(rs.getInt(7));
                                prestamo.setId_libro_prestamo(rs.getInt(8));
                                prestamo.setId_lector_prestamo(rs.getInt(9));
                                prestamo.setFecha_prestamo(rs.getString(10));
                                prestamo.setFecha_devolucion(rs.getString(11));
                                prestamo.setMulta(rs.getBoolean(12));
				rs.next();
				listaAlumnos.add(libro);
                                listaAlumnos.add(prestamo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		      System.out.println("conexionBD.PrestamoDAO.buscarAlumnosList() "+listaAlumnos);
		return listaAlumnos;
	}
    
}
