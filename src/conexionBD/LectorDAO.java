/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;
import java.sql.SQLException;
import modelo.Lector;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author erik
 */
public class LectorDAO {
    
    private final String TABLA = "lector";
    
    public LectorDAO(){
        
    }
    
    public boolean agregarLector(Lector l,conexionBD c){
        
        String sql = "INSERT INTO Lector VALUES("
	+l.getId_lector()+",'"
        +l.getNombre()+"','"
        +l.getPrimerAp()+"','"
        +l.getSegundoAp()+"','"
        +l.getFecha()+"','"
        +l.getTelefono()+"','"
        +l.getCalle()+"','"
        +l.getNoCalle()+"','"
        +l.getColonia()+"')";
        
        
        return c.ejecutarInstruccionSQL(sql);
    }
    
    public void eliminarLector(int clave,conexionBD c){
        String sql = "DELETE FROM Lector WHERE id_lector = "+clave;
        
        c.ejecutarInstruccionSQL(sql);
    }
    
    public boolean modificarLector(Lector l,conexionBD conexion) {
		
		String sql = "UPDATE Lector SET id_lector ="+l.getId_lector()
		+",Nombre_lector='"+l.getNombre()
		+"',Primer_Ap_Lector='"+l.getPrimerAp()
		+"',Segundo_Ap_Lector='"+l.getSegundoAp()
		+"',Fecha_Nacimiento_Lector='"+l.getFecha()
                +"',telefono='"+l.getTelefono()
                +"',calle='"+l.getCalle()
                +"',numero_calle='"+l.getNoCalle()
                +"',colonia='"+l.getColonia()
                +"' where id_lector = "+l.getId_lector()+"";
		
                System.out.println("conexionBD.LectorDAO.modificarLector() SQL --> "+sql);
		
		return conexion.ejecutarInstruccionSQL(sql);
    }
    
    public Lector buscarLector(int id,conexionBD conexion) {
	Lector lector = null;

        String instruccionSQL = "SELECT * FROM "+ TABLA +" WHERE id_lector = "+id+"";
        ResultSet rs = conexion.consultarRegistros(instruccionSQL);
        //ResultSet rs = conexion.consultarRegistros(id,id);
        try{
            if(rs.first()){
                lector = new Lector(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9));
            }
           // conexion.cerrarConexion();
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return  lector;
    }
    
    public boolean consultaLector(String clave,String valor,JTable tabla,conexionBD conexion){
        boolean completo = false;

        DefaultTableModel modelo = new DefaultTableModel();
      //  ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE "+clave+" = '"+valor+"'");
        ResultSet rs = conexion.consultarRegistrosMultiples(clave,valor,TABLA);
        //ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE "+clave+" = "+valor);
        //ResultSet rs = conexion.consultarRegistros("SELECT * FROM Lector WHERE IdLector = '"+valor+"'");
        modelo.setColumnIdentifiers( new Object[] {
                "Id Lector", "Nombre", "Primer Apellido","Segundo Apellido", "Fecha", "Telefono","Calle","NoCalle","Colonia"});


        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)});
                completo = true;
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
            completo = false;
        }
        return  completo;
    }
    
}
