package com.alura.desafio.CoversorMoneda;

import java.util.Scanner;

public class ConversionMoneda {

    public static void convertir(String mBase, String mConvertir, ConsultaMoneda consulta, Scanner lectura){
        double valor;
        double valorConvertir;

        Conversor monedas = consulta.buscarMoneda(mBase, mConvertir);
        System.out.println("La tasa de conversión es \n1 " + mBase + " = " + monedas.conversionRate() + " " + mConvertir);
        System.out.println("Ingrese la cantidad a convertir: " + mBase);
        valor = lectura.nextDouble();
        valorConvertir = valor * monedas.conversionRate();
        System.out.println(valor + " " + mBase + " = " + valorConvertir + " " + mConvertir);
    }

    public static void convertirMasMonedas(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el código de la Moneda a convertir: ");
        String mBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la Moneda Nueva: ");
        String mConvertir = lectura.nextLine().toUpperCase();
        convertir(mBase, mConvertir, consulta, lectura);
    }
}
