/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;//mysql.jdbc.PreparedStatement;

/**
 *
 * @author erik
 */
public class conexionBD {
    private static Connection con = null;
    private Statement stm;
    private static conexionBD miConexionBD;
    public static String usuario;
    public static String contra;
    private String url;
    private String bd;
    boolean flag = false;
    ResultSet rs;
    PreparedStatement pstmt;
    

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        conexionBD.usuario = usuario;
    }

    public static String getContra() {
        return contra;
    }

    public static void setContra(String contra) {
        conexionBD.contra = contra;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
    
    
    public static conexionBD getConexionBD(String url,String bd){
        if(miConexionBD == null){
            miConexionBD = new conexionBD(url, bd);
        }
        return miConexionBD;
    }
    
    private conexionBD(String url,String bd){
        this.url=url;
        this.bd=bd;
    }
/*
    public static Connection getConnection(){
        try {
            if( con == null ){
                String driver="com.ibm.db2.jcc.DB2Driver"; //el driver varia segun la DB que usemos
                String url="jdbc:db2://localhost:50001/Biblio";
                String pwd="root1";
                String usr="db2inst1";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection exitosa");
            }

        }catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }*/
    
    public boolean conexion(){
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = (DriverManager.getConnection(getUrl()+getBd(), getUsuario(), getContra()));
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR EN EL DRIVER");
        }
        return flag;
    }
    
     public boolean ejecutarInstruccionSQL(String sql) {

        int ejecucion;
        try {
            stm = (Statement)con.createStatement();
            ejecucion = stm.executeUpdate(sql);
            return ejecucion==1?true:false;
        }
        catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
     public boolean instruccionSQL(String sql){
         boolean x = false;
        try {
            stm = con.prepareStatement(sql);
            stm.executeUpdate(sql);
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
     }
     
     public ResultSet consultarRegistros(String sql) {
		
	try {
            //stm = con.prepareStatement(sql);
            stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(sql);
	} catch (SQLException e) {
            e.printStackTrace();
	}
            /*finally {
            try {
            con.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }*/
	return rs;
    }
     
     public ResultSet consultarRegistrosMultiples(String clave,String valor,String tabla) {
		
	try {
            //stm = con.prepareStatement(sql);
            //stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //stm = con.prepareStatement("select * from Lector where "+clave+" = ? ");
            //stm.s
            pstmt = con.prepareStatement("select * from "+tabla+" where "+clave+" = ? ");
            pstmt.setString(1, valor);
            System.out.println("metodo consultar registros multiples(conexionBD) "+rs);
            rs = pstmt.executeQuery();
	} catch (SQLException e) {
            e.printStackTrace();
	}
            /*finally {
            try {
            con.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }*/
            
	return rs;
    }
     
    public ResultSet consultarAvanzada(String sql) {
		
	try {
            //stm = con.prepareStatement(sql);
            //stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //stm = con.prepareStatement("select * from Lector where "+clave+" = ? ");
            //stm.s
            pstmt = con.prepareStatement(sql);
            //pstmt.setString(1, valor);
            rs = pstmt.executeQuery();
	} catch (SQLException e) {
            e.printStackTrace();
	}
            /*finally {
            try {
            con.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }*/
            
	return rs;
    } 
}
