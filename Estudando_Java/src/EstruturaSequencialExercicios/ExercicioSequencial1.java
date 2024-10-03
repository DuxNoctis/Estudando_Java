import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

public class ExercicioSequencial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, resultado;

        x = sc.nextInt();
        y = sc.nextInt();
        resultado = x + y;

        System.out.printf("SOMA = %d", resultado);

        sc.close();
    }
}
