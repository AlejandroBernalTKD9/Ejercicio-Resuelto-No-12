/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto_no_12;

/**
 *
 * @author Alejandro Bernal
 */
public class Ejercicio_Propuesto_No_12 {
    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion;
        double salario_bruto, salario_neto;
        valor_hora=5000;
        horas_trabajadas=48;
        salario_bruto=valor_hora*horas_trabajadas;
        retencion=salario_bruto*(12.5/100);
        salario_neto=salario_bruto-retencion; 
        System.out.println("Horas trabajadas: " +horas_trabajadas );
        System.out.println("Valor hora es: " + valor_hora);
        System.out.println("Retencion es: " +retencion );
        System.out.println("Salario bruto es: " +salario_bruto );
        System.out.println("Salario neto es: " +salario_neto );
    }
}
