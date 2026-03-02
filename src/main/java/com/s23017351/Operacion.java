package com.s23017351;
import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;
    private final Scanner input;

    public Operacion() {
        this.input = new Scanner(System.in);
        this.num1 = 0;
        this.num2 = 0;
    }

    public void recibir(){
        System.out.println("Primer numero:");
        this.num1 = this.input.nextInt();
        System.out.println("Segundo numero:");
        this.num2 = this.input.nextInt();
    }

    public int multiplicar(){
        // Multiplicar numeros
        return (this.num1*this.num2);
    }

    public int sumar(){
        return (this.num1 + this.num2);
    }

    public int restar(){
        return (this.num1 - this.num2);
    }

    public float dividir(){
        return (float) this.num1 / this.num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}
