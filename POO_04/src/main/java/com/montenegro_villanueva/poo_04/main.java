/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montenegro_villanueva.poo_04;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class main {
    public static void main(String[] args) {
        String empresa = datoEmpre();
        Empleado[] empleado = DatoEmple();
        System.out.println("La empresa se llama: " + empresa + " Y estos son sus datos: " + empleado);
    }

    private static String datoEmpre() {
        //String nombre, Empleado[] emp, Cliente[] cli
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa");
        String nom = lector.next();
        return nom;
    }

    private static Empleado[] DatoEmple() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos empleados va a ingresar: ");       
        int cant =lector.nextByte();
        Empleado[] empleado = new Empleado[cant];
        double sueldo = 10000.00;
        double obraSo = 27/100 * sueldo;
        double jubil = 38/100 * sueldo;
        double precent = 5/100 * sueldo;
        for (int i = 0; i < cant; i++) {
            SueldoNeto[] suelN = new SueldoNeto[cant];
            System.out.println("Ingrese el cargo de su empleado \n" + "1. Directivo \n" + "2. Subordinado");
            String tipo = lector.next();
            System.out.println("Ingrese el DNI del empleado: ");
            int dni = lector.nextInt();
            System.out.println("Cual es el nombre del empleado: ");
            String nom = lector.next();
            System.out.println("Ingrese el apellido del empleado");
            String ape = lector.next();
            System.out.println("Cual es la edad del empleado: ");
            int edad = lector.nextInt();
            System.out.println("Ingrese cuento clientes tiene: ");
            int cancli = lector.nextInt();
            Cliente[] cliente = new Cliente[cancli];
            for (int a = 0; a < cancli; a++) {
                cliente[a] = datoCliente();
            }
            if(tipo.equals("directivo")){
                Subordinados[] lista = datoSubordinado();
                suelN[i] = new SueldoNeto (tipo, sueldo, obraSo, jubil, precent);
                empleado[i] = new Directivo (dni, nom, ape, edad, cliente, suelN[i]);
               //int d, String n, String a, int e, Cliente[] c, SueldoNeto s 
            }
            //String c ,double s, double os, double j, double p
            empleado[i] = new Empleado(dni, nom, ape, edad, cliente ,suelN[i]);
            //int d, String n, String a, int e, Cliente[] c, SueldoNeto s
        }
        return empleado;
    }
    private static Subordinados[] datoSubordinado() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cuentos empleados subordinados tiene a cargo: ");
        int cantem = lector.nextInt();
        Subordinados[] sub= new Subordinados[cantem];
        Empleado[] empleado = new Empleado[cantem];
        SueldoNeto[] suelN = new SueldoNeto[cantem];
        double sueldo = 10000.00;
        double obraSo = 27/100 * sueldo;
        double jubil = 38/100 * sueldo;
        double precent = 5/100 * sueldo;
        for (int j = 0; j < cantem; j++) {
            String tipo = "Subordinado";
            System.out.println("Ingrese el DNI del empleado: ");
            int dniS = lector.nextInt();
            System.out.println("Cual es el nombre del empleado: ");
            String nomS = lector.next();
            System.out.println("Ingrese el apellido del empleado");
            String apeS = lector.next();
            System.out.println("Cual es la edad del empleado: ");
            int edadS = lector.nextInt();
            System.out.println("Ingrese cuento clientes tiene: ");
            int cancliS = lector.nextInt();
            Cliente[] clienteS = new Cliente[cancliS];
            for (int a = 0; a < 10; a++) {
                clienteS[a] = datoCliente();
            }
            double sueldoD = sueldo + 20/100 * sueldo;
            suelN[j] = new SueldoNeto (tipo, sueldoD, obraSo, jubil, precent);
            sub[j] = new Subordinados(dniS, nomS, apeS, edadS, clienteS, suelN[j]);
        }
        return sub;
    }

    private static Cliente datoCliente() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente");
        int dni = lector.nextInt();
        System.out.println("Ingrese el nombre del cliente");
        String nom = lector.next();
        System.out.println("Ingrese el apellido del cliente");
        String ape = lector.next();
        System.out.println("Ingrese la edad del cliente");
        int numedad = lector.nextInt();
        System.out.println("ingrese el numero de telefono del cliente");
        int numetel = lector.nextInt();
        Cliente cliente = new Cliente(dni, nom, ape, numedad, numetel);
        return cliente;
    }
}

