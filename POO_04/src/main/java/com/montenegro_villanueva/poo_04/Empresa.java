package com.montenegro_villanueva.poo_04;
//villanueva

public class Empresa {

    private String nombre;
    private Empleado[] empleado;
    private Cliente[] cliante;

    public Empresa(String n ,Empleado[] e,Cliente[] c){
        this.nombre = n;
        this.empleado = e;
        this.cliante = c;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de Empresa: "+this.nombre+
                            "Empleado: "+this.empleado+
                            "cliente: "+this.cliante);
    }
}

