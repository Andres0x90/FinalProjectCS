package backend;

import database.Crud;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Articulo {

    protected String codigo;
    protected String titulo;
    protected String genero;
    protected float precio;
    protected int cantidad;
    protected String tipo;

    public Articulo(String codigo, String titulo, String genero, float precio, int cantidad, String tipo) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Metodos para trabajar con el CRUD
    
    public void registrar(Component parent) 
    {
        Crud crudArticulo = new Crud();
        boolean done = crudArticulo.create("INSERT INTO articulo VALUES('" + this.codigo +"','" + 
                this.titulo +"','" + this.genero + "','" + this.precio + "','" + this.cantidad +"','" + this.tipo +"')");
        if (done)
            JOptionPane.showMessageDialog(parent, "Articulo registrado correctamente.");
        else
            JOptionPane.showMessageDialog(parent, "Ocurrio un error al registrar el articulo.");
    }
}
