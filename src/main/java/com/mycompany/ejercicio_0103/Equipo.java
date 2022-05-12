/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class Equipo {
    private String nombre; 
    private int numeroJugadores; 
    private int id; 
    private Jugador [] jugadorList; 

    public Equipo(String nombre, int numeroJugadores, int id, Jugador[] jugadorList) {
        this.nombre = nombre;
        this.numeroJugadores = numeroJugadores;
        this.id = id;
        this.jugadorList = jugadorList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador[] getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(Jugador[] jugadorList) {
        this.jugadorList = jugadorList;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", numeroJugadores=" + numeroJugadores + ", id=" + id + ", jugadorList=" + jugadorList + '}';
    }
    
    public void imprimir3(){
         for (Jugador jugador : jugadorList) {
             System.out.println(jugador.toString());
         }
    }
}
