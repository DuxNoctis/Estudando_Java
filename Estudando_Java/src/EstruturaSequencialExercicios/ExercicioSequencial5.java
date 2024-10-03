import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

public class ExercicioSequencial5 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int cod1, qtd1, cod2, qtd2;
            double valorUni1, valorUni2, valorFinal;
            
            Locale.setDefault(Locale.US);
            cod1 = sc.nextInt();
            qtd1 = sc.nextInt();
            valorUni1 = sc.nextDouble();
            
            cod2 = sc.nextInt();
            qtd2 = sc.nextInt();
            valorUni2 = sc.nextDouble();
            

            valorFinal = qtd1 * valorUni1 + qtd2 * valorUni2;

            System.out.printf("Os produtos de codigo: %d e %d, deram um valor total de: \n", cod1, cod2);
            System.out.printf("Valor a pagar: R$ %.2f", valorFinal);

            sc.close();
        }

}
