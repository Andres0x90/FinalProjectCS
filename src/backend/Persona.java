/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Component;

/**
 *
 * @author Andres
 */
public abstract class Persona 
{
    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String telefono;
    
    public abstract void registrar(Component parent);
    public abstract void buscar(Component parent, String codigo);
    public abstract void eliminar(Component parent);
    public abstract void actualizar(Component parent, String codigo,String nombre, String apellido, int edad,String direccion, String telefono);

    public Persona(String codigo, String nombre, String apellido, int edad, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
