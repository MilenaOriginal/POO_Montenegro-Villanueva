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
public class Directivo extends Empleado{
    private Subordinados[] subordinados;
    
    public Directivo(int d, String n, String a, int e, Cliente[] c, SueldoNeto s, Subordinados[] su){
        super(d,n,a,e,c,s);
        this.subordinados = su;
    }

    Directivo(int dniS, String nomS, String apeS, int edadS, Cliente[] clienteS, SueldoNeto suelN) {
        super(dniS,nomS,apeS,edadS,clienteS, suelN);
    }

    
    public void mostrarDatos(){
//        String devol = super.toString() + this.subordinados;
//        return devol;
        System.out.println(super.toString() + "\n Sus subordinados son: " + this.subordinados);
    }
}
