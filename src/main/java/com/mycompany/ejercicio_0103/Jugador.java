/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class Jugador {
    private String nombre; 
    private String cedula; 
    private int anio;
    private String posicion; 

    public Jugador(String nombre, String cedula, int anio, String posicion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.anio = anio;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", cedula=" + cedula + ", anio=" + anio + ", posicion=" + posicion + '}';
    }
}
