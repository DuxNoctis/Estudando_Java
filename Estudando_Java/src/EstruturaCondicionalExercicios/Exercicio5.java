/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod, qtd;
        double valor;

        System.out.println("Digite o código e a quantidade do item: ");

        cod = sc.nextInt();
        qtd = sc.nextInt();


        if(cod==1){
            valor = (double)qtd*4.0;
            System.out.printf("Total: R$ %.2f", valor);
        }
        else if(cod==2){
            valor = (double)qtd*4.5;
            System.out.printf("Total: R$ %.2f", valor);
        }
        else if(cod==3){
            valor = (double)qtd*5.0;
            System.out.printf("Total: R$ %.2f", valor);
        }
        else if(cod==4){
            valor = (double)qtd*2.0;
            System.out.printf("Total: R$ %.2f", valor);
        }
        else if(cod==5){
            valor = (double)qtd*1.5;
            System.out.printf("Total: R$ %.2f", valor);
        }
        
        sc.close();

    }
}
