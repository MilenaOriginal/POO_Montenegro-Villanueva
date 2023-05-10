/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montenegro_villanueva.poo_04;
// Montenegro

import java.util.Arrays;

/**
 *
 * @author CS-08
 */
public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Cliente[] clientes;
    private SueldoNeto sueldoN;
    
    public Empleado(int d, String n, String a, int e, Cliente[] c, SueldoNeto s){
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
        this.clientes = c;
        this.sueldoN = s;
    }
    public void mostrarDatos(){
        System.out.println("El DNI es: " + this.dni+ "\n"
                + "Se llama: " + this.nombre + this.apellido +"\n"
                + "Tiene " + this.edad + " años \n" 
                + "Tiene a su cargo a: " + this.clientes + "\n"
                + "Y gana: " + this.sueldoN);
    }
}
