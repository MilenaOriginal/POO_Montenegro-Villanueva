package com.montenegro_villanueva.poo_04;

//Juan Andres Villanueva

public class SueldoNeto {
    private String cargo;
    private double sueldoB;
    private double obraS;
    private double jubilacion;
    private double presentismo;
    
    public SueldoNeto(String c ,double s, double os, double j, double p){
        this.cargo = c;
        this.sueldoB = s;
        this.obraS = os;
        this.jubilacion = j;
        this.presentismo = p;
    }

    
    public double CalcuarSB(){
        return this.sueldoB;
    }
    public double calcularSN(){
        this.obraS = 3/100 * this.sueldoB;
        this.jubilacion = 11/100 * this.sueldoB;
        this.presentismo = 10/100 * this.sueldoB;
        double num = 0.0;
        num = this.sueldoB - this.obraS - this.jubilacion + this.presentismo;
        return num;
    }
    public String datosSueldo(){
        String sueldo = this.cargo + this.sueldoB+ this.obraS + this.jubilacion + this.presentismo;
        return(sueldo);
    }
}

