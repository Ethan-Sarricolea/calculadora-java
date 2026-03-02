package com.s23017351;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Operacion operaciones = new Operacion();
        boolean status = true;
        Scanner option = new Scanner(System.in);

        do { 
            System.out.println("===Calculadora===");
            System.out.println("Selecciona una operación");
            System.out.println("1)Sumar 2)Restar 3)Multiplicar 4)Dividir ");

            switch (option.nextInt()) {
                case 1 -> {
                    System.out.println("---Suma---");
                    operaciones.recibir();
                    System.out.println("Resultado = " + operaciones.sumar());
                }
                case 2 -> {
                    System.out.println("---Resta---");
                    operaciones.recibir();
                    System.out.println("Resultado = " + operaciones.restar());
                }
                case 3 -> {
                    System.out.println("---Multiplicar---");
                    operaciones.recibir();
                    System.out.println("Resultado = " + operaciones.multiplicar());
                }
                case 4 -> {
                    System.out.println("---Dividir---");
                    operaciones.recibir();
                    System.out.println("Resultado = " + operaciones.dividir());
                }
                default -> {
                    System.out.println("---Saliendo---");
                    status = false;
                }
            }
        } while (status);
        option.close();
    }
}