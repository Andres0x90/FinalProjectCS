
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class opEmpleado {
    
    String cadenaConexion = "jdbc:sqlserver://;database=videotienda;integratedSecurity=true";
    
    public ResultSet login(String user, String pass){
        ResultSet result = null;
        try{
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            String query = "Select * from empleado where usuario = '+"+user+"', contrasena = '"+pass+"'";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                result =  rs;
            }
            con.close();
            stmt.close();
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return result;
    }
    
    private boolean add(String codigo, String nombre, String apellido, int edad, String telefono, String user, String pass){
        boolean result = false;
        try {
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            
            String query = "Insert into empleado values('"+codigo+"','"+nombre+"','"+apellido+"',"+edad+",'"+telefono+"','"+user+"','"+pass+"');";
            stmt.executeUpdate(query);
            
            
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error:"+ex);
        }
        return result;
    }

    public ResultSet buscar(String codigo){    
        ResultSet result = null;
        try {
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery("Select * from empleado where codigo = '"+codigo+"';");
            if(rs.next()){
                result = rs;
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return result;
    }
    
    public boolean update(String codigo, String nombre, String apellido, int edad, String telefono, String user, String pass){
        boolean result=false;
        try {
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            
            String query = "Update empleado set nombre='"+nombre+"',apellido='"+apellido+"',edad="+edad+",telefono='"+telefono+"', usuario='"+user+"', contrasena='"+pass+"' where codigo='"+codigo+"';";
            stmt.executeUpdate(query);
            
            result = true;
            
            stmt.close();
            con.close();
        }catch (SQLException ex) {
            System.out.println("ha ocudrrido un error: "+ex);
        }
        return result;   
    }
    
    public boolean delete(String codigo){
        boolean ok = false;
        try {
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
        
            stmt.executeUpdate("delete from empleado where codigo='"+codigo+"';");
            ok = true;
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return ok;
   }
    
}
