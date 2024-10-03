import java.util.Scanner;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

public class ExercicioSequencial2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double pi, r, r2, resultado;
        pi = 3.14159;
        r = sc.nextDouble();
        r2 = Math.pow(r,2);

        resultado = pi*r2;

        System.out.printf("A=%.4f", resultado);

        sc.close();
    }
}
