/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0103;

/**
 *
 * @author PCG
 */
public class AutorPrincipal {
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String Direccion;
    private String telefono;
    private String correo;

    public AutorPrincipal(int id, String nombre, String apellido, String cedula, String Direccion, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public AutorPrincipal() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "AutorPrincipal{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", Direccion=" + Direccion + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
   
}
