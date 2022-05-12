/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class Articulo {
    private String nombre; 
    private int id; 
    private int numeroArticulo; 
    private AutorPrincipal [] autorList; 

    public Articulo(String nombre, int id, int numeroArticulo, AutorPrincipal[] autorList) {
        this.nombre = nombre;
        this.id = id;
        this.numeroArticulo = numeroArticulo;
        this.autorList = autorList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public AutorPrincipal[] getAutorList() {
        return autorList;
    }

    public void setAutorList(AutorPrincipal[] autorList) {
        this.autorList = autorList;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", id=" + id + ", numeroArticulo=" + numeroArticulo + '}';
    }
    
    public void imprimir1(){
         for (AutorPrincipal autorPrincipal : autorList) {
             System.out.println(autorPrincipal.toString());
         }
    }
}
