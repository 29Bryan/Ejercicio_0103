/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class Partido {
    private int partido; 
    private String nombreCampeonato; 
    private String nombreOrganizacion; 

    public Partido(int partido, String nombreCampeonato, String nombreOrganizacion) {
        this.partido = partido;
        this.nombreCampeonato = nombreCampeonato;
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    @Override
    public String toString() {
        return "Partido{" + "partido=" + partido + ", nombreCampeonato=" + nombreCampeonato + ", nombreOrganizacion=" + nombreOrganizacion + '}';
    }
}
