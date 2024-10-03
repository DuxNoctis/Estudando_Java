/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número e descubra seu intervalo: ");
        x = sc.nextInt();

        if (x>=0 && x<25){
            System.out.printf("O número %d está no Intervalo (0,25)", x);
        }
        else if (x>=25 && x<50){
            System.out.printf("O número %d está no Intervalo (25,50)", x);
        }
        else if (x>=50 && x<75){
            System.out.printf("O número %d está no Intervalo (50,75)", x);
        }
        else if (x>=75 && x<=100){
            System.out.printf("O número %d está no Intervalo (75,100)", x);
        }
        else{
            System.out.printf("O numero %d não está em nenhum destes intervalos", x);
        }

        sc.close();
    }
}
