/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;
import modelo.Libro;
import conexionBD.*;
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
        +l.getTipoLibro()+"','"
        +l.getGenero()+"')";
        
        return c.ejecutarInstruccionSQL(sql);
    }
    
    public void eliminarLibro(int clave,conexionBD c){
        String sql = "DELETE FROM LIBRO WHERE id_libro = "+clave;
        
        c.ejecutarInstruccionSQL(sql);
    }
    
}
