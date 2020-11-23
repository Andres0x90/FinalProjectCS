
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class opEmpleado {
    
    String cadenaConexion = "jdbc:sqlserver://;database=videotienda;integratedSecurity=true";
    
    public opEmpleado(){
    
    }
    
    public boolean login(String user, String pass){
        boolean existe=false;
        try{
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            String query = "Select * from empleado where usuario = '"+user+"' and contrasena = '"+pass+"'";
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                existe  = true;
            }
            
            stmt.close();
            con.close();
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return existe;
    }
    
    
    
}
