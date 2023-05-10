/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montenegro_villanueva.poo_04;
//Montenegro
/**
 *
 * @author CS-08
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int numTelefono;
    
    public Cliente(int d, String n, String a, int e, int nt){
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
        this.numTelefono = nt;
    }
    public void mostrarDatos(){
        System.out.println("De DNI: " + this.dni + "\n"
                + "Se llama: " + this.nombre + this.apellido + "\n"
                        + "Tiene " + this.edad + " años" + "\n"
                                + "Y su contacto es: " + this.numTelefono);
    }
}
