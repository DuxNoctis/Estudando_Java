/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente*/ 


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números e descubra se eles são multiplos: ");
        
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        if(A%B == 0 || B%A == 0){
            System.out.printf("Os números: %d e %d, são multiplos!", A, B);
        }
        else{
            System.out.printf("Os números: %d e %d, não são multiplos", A, B);
        }

        sc.close();
    }
}
