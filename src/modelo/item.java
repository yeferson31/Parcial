/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Kta Contreras
 */
public class item {
    private int aumento;
    private String codigo;
    private String nombre;
    private String tipo;
    private String cantidad;

    public String getCodigo() {
        return codigo;
    }
    
    public int getAumento(){
        return aumento;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public item(String codigo, String nombre, String tipo, String cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    

    public item() {
        aumento = 1+aumento;
    }

    
    
    

    @Override
    public String toString() {
        return codigo + ";" 
             + nombre + ";"
             + tipo + ";" 
             + cantidad;
    }

    
    
}


