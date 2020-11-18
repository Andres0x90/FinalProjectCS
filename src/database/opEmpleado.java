
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
    
    public ArrayList<String> login(String user, String pass){
        ArrayList<String> result = null;
        try{
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            String query = "Select * from empleado where usuario = '"+user+"' and contrasena = '"+pass+"'";
            ResultSet rs = stmt.executeQuery(query);
            
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            
            while(rs.next()){
                result = new ArrayList<String>();
                for (int i = 1; i <=numberOfColumns;i++) {
                    result.add(rs.getString(i));
                }
            }
            
            
            stmt.close();
            con.close();
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return result;
    }
    
    
    
}
