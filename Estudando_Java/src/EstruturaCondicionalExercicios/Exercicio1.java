/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int number;
        
        System.out.println("Digite um numero: ");
        number = sc.nextInt();

        if (number<0){
            System.out.printf("O numero: %d, é negativo", number);
        }
        else {
            System.out.printf("O numero: %d, é positivo", number);
        }

        sc.close();

    }
}
