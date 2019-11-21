/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;
import modelo.Libro;
import conexionBD.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author erik
 */
public class LibroDAO {
    
    //conexionBD b;
    
    public LibroDAO(){
        
    }
    
    public boolean agregarLibro(Libro l,conexionBD c){
        String sql = "INSERT INTO Libro VALUES("
	+l.getId_libro()+",'"
        +l.getTitulo()+"','"
        +l.getEditorial()+"','"
        +l.getFecha()+"','"
        +l.getISBN()+"','"
        +l.getTipoLibro()+"','"
        +l.getGenero()+"')";
        
        return c.ejecutarInstruccionSQL(sql);
    }
    
    public void eliminarLibro(int clave,conexionBD c){
        String sql = "DELETE FROM LIBRO WHERE id_libro = "+clave;
        
        c.ejecutarInstruccionSQL(sql);
    }
    
    public boolean modificarLibro(Libro libro,conexionBD conexion) {
		
		String sql = "UPDATE Libro SET id_libro ="+libro.getId_libro()
		+",Titulo='"+libro.getTitulo()
		+"',Editorial='"+libro.getEditorial()
		+"',Year='"+libro.getFecha()
		+"',ISBN='"+libro.getISBN()
                +"',tipo_libro='"+libro.getTipoLibro()
                +"',genero="+libro.getGenero()+" where id_libro = "+libro.getId_libro()+"";
		
		
		return conexion.ejecutarInstruccionSQL(sql);
	}
    
    public Libro buscarLector(int id,conexionBD conexion) {
	Libro libro = null;

        String instruccionSQL = "SELECT * FROM Libro WHERE id_libro = "+id+"";
        ResultSet rs = conexion.consultarRegistros(instruccionSQL);
        //ResultSet rs = conexion.consultarRegistros(id,id);
        System.out.println("rs de buscar lector "+rs);
        try{
            if(rs.first()){
                libro = new Libro(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7));
            }
           // conexion.cerrarConexion();
        }catch(SQLException e) {
            e.printStackTrace();
        }
        System.out.println("objeto libro de buscar libro "+libro);
        return  libro;
    }
    
}
