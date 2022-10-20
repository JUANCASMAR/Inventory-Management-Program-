/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Juan Antonio Casas Martínez
 */
public class Produkto {
    
    
    private Integer id;
    private String nombre; 
    private String raiz; 
    private Integer cantidad;
    private double precio; 
    private Integer disponibilidad;


    public Produkto(Integer id, String nombre, String raiz, Integer cantidad, double precio, Integer disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.raiz = raiz;
        this.cantidad = cantidad;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public Integer getId() {
        return id; 
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaiz() {
        return raiz;
    }
    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
    
}
