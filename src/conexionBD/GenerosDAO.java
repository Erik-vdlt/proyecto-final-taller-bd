/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
/**
 *
 * @author erik
 */
public class GenerosDAO {
    //ResultSet rs;
    //conexionBD c;
    public GenerosDAO(){
        
    }
    
    public int claveId(String genero,conexionBD conexion){
        Generos g = null;// = new Generos();
        String instruccionSQL = "select id_genero from generos where nombre_genero = '"+genero+"'";
        
        ResultSet rs = conexion.consultarRegistros(instruccionSQL);
        
        try {
            if(rs.next()){
               
                g = new Generos(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return g.getId_genero();
    }
    
    public ArrayList<Generos> buscarAlumnos(conexionBD c){
        ArrayList<Generos> listaGeneros = new ArrayList();
		
		/*
		 Sintaxis de busqueda de regitros en MySQL (para resultados de 2 o más registros)
		 
		 SELECT * FROM alumnos WHERE PrimerAp = 'Perez';
		 
		*/
		
	//String instruccionSQL = "SELECT * FROM alumnos WHERE primerAp = '"+filtro+"'";
        String instruccionSQL = "SELECT nombre_genero FROM Generos";
        //System.out.println("conexionBD.GenerosDAO.buscarAlumnos() "+c.consultarRegistros(instruccionSQL));
        
	ResultSet rs = c.consultarRegistros(instruccionSQL);
        
                //.consultarRegistros(instruccionSQL);
		
	try {
			
            if(rs.first()) {
				
                do {
					
                    listaGeneros.add(new Generos(rs.getString(1)));
					
		}while(rs.next());
				
            }else {
                    listaGeneros = null;
                }
			
	} catch (SQLException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
	}
		
	return listaGeneros;
	}//MÉTODO BUSCAR ALUMNOS
    
}
