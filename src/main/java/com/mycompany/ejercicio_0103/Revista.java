/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class Revista {
    private int id;
    private String nombre;
    private String nombreEditorial;

    public Revista(int id, String nombre, String nombreEditorial) {
        this.id = id;
        this.nombre = nombre;
        this.nombreEditorial = nombreEditorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "Revista{" + "id=" + id + ", nombre=" + nombre + ", nombreEditorial=" + nombreEditorial + '}';
    }
}
