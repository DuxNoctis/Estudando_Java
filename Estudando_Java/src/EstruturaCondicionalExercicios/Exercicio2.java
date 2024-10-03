/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um número e descubra se ele é impar ou par: ");
        number = sc.nextInt();

        if(number%2 == 0){
            System.out.printf("O numero: %d, é um numero par!", number);
        }
        else{
            System.out.printf("O numero: %d, é um numero impar!", number);
        }


        sc.close();
    }
}
