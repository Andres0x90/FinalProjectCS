package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reportes {
    
    
    public Reportes(){
    }
    
    String cadenaConexion = "jdbc:sqlserver://;database=videotienda;integratedSecurity=true";
    
    public ResultSet listar(String query){
        ResultSet rsLista = null;
        try {
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rsLista = rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsLista;
    }
    public ResultSet ventasXVendedor(String codigoEmpleado){
        ResultSet rsVentasXvendedor = null;
        try{
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from venta where cod_emp = (select codigo from empleado where codigo='"+codigoEmpleado+"');");
            rsVentasXvendedor = rs;
        }catch(SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsVentasXvendedor;
    }
    
    public ResultSet VendioXProducto(String codigoVenta, String codigoProducto){
        ResultSet rsVendioXProducto = null;
        try{
            Connection con = DriverManager.getConnection(cadenaConexion);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from empleado where codigo = (select cod_emp from venta where (cod_art = '"+codigoProducto+"' and codigo = '"+codigoVenta+"'));");
            rsVendioXProducto = rs;
        }catch(SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsVendioXProducto;
    }
}
