/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_0103;

import java.util.List;

/**
 *
 * @author PCG
 */
public class Ejercicio_0103 {

    public static void main(String[] args) {
        
        var a = new AutorPrincipal(1, "Bryan", "Peñaranda", "0123654789", "Gualaceo", 
                                   "0987654321", "PeñaW@hotmail.com");
        var lista = new AutorPrincipal[1];
        lista[0]= a;
        var ar = new Articulo("Ciencia y tecnologia", 1, 1, lista);
        var re = new Revista(1, "Boss", "Mercurio"); 
        
        /**var listaAr = new Articulo[1];
        lista[0]= ar;
        var revista = new Revista(0, nombre, nombreEditorial, articulo);**/
        
        System.out.println(re.toString());
        System.out.println(ar.toString());
        ar.imprimir1();
        
        System.out.println("-----------------------------------------------");
        
        var b = new Jugador("Bryan", "0106982523", 22, "Delantero"); 
        var lista1 = new Jugador[1]; 
        lista1[0]= b;
        var eq = new Equipo("FC Barcelona", 25, 65, lista1); 
        var par = new Partido(4, "La Liga", "Fedreacion de España");
        
        System.out.println(par.toString());
        System.out.println(eq.toString());
        eq.imprimir3();
    }
}
