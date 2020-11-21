/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import database.*;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Cliente extends Persona
{
    private String direccion;

    public Cliente(String codigo,String nombre, String apellido, int edad,String direccion, String telefono) 
    {
        super(codigo, nombre, apellido, edad, telefono);
        this.direccion = direccion;
    }

    public Cliente() 
    {
        super("", "", "", 0, "");
        this.direccion = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void registrar(Component parent) 
    {
        Crud crudCliente = new Crud();
        boolean done = crudCliente.create("INSERT INTO cliente VALUES('" + this.codigo + "','"+
                  this.nombre + "','" + this.apellido + "'," + this.edad +
                    ",'" + this.direccion + "','" + this.telefono + "')");
        if (done)
            JOptionPane.showMessageDialog(parent, "Cliente registrado correctamente");
        else
            JOptionPane.showMessageDialog(parent, "Ocurrio un error al registrar el cliente");
    }

    @Override
    public void buscar(Component parent,String codigo) 
    {
        Crud crudCliente = new Crud();
        ArrayList <String> data = crudCliente.read("SELECT * FROM cliente WHERE cliente.codigo = '" + codigo + "'");
        
        if (data != null)
        {
            this.codigo = data.get(0);
            this.nombre = data.get(1);
            this.apellido = data.get(2);
            this.edad = Integer.parseInt(data.get(3));
            this.direccion = data.get(4);
            this.telefono = data.get(5);
        }
        else
        {
            JOptionPane.showMessageDialog(parent, "Cliente no encontrado");
        }
    }

    @Override
    public void eliminar(Component parent) 
    {
        Crud crudCliente = new Crud();
        crudCliente.delete("DELETE FROM cliente WHERE cliente.codigo = '" + this.codigo + "'");
        
        if (this.codigo.equals(""))
        {
            JOptionPane.showMessageDialog(parent, "Por favor busque un cliente valido");
        }
        else
        {
            this.codigo = "";
            this.nombre = "";
            this.apellido = "";
            this.edad = 0;
            this.direccion = "";
            this.telefono = "";            
            JOptionPane.showMessageDialog(parent, "Cliente elminado correctamente");
        }
    }

    @Override
    public void actualizar(Component parent,String codigo,String nombre, String apellido, int edad,String direccion, String telefono) 
    {
        if (this.codigo.equals(""))
        {
            JOptionPane.showMessageDialog(parent, "Por favor busque un cliente valido");
        }
        else
        {
            Crud crudCliente = new Crud();
            crudCliente.update("UPDATE cliente SET codigo='" + codigo + "',nombre='" + nombre + "',edad=" + edad +
                    ",dir='" + direccion + "',telefono='" + telefono + "' WHERE codigo='" + this.codigo +"'");   
            
            JOptionPane.showMessageDialog(parent, "Cliente actualizado correctamente");
        }
    }
    
}
