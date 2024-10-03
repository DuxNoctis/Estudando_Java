import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B*/

public class ExercicioSequencial6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        Locale.setDefault(Locale.US);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangulo = A*C/2;
        circulo = 3.14159 * C *C;
        trapezio = (A + B)*C/2;
        quadrado = B*4;
        retangulo = A*B;

        System.out.printf("Triangulo : %.3f\n", triangulo);
        System.out.printf("Circulo : %.3f\n", circulo);
        System.out.printf("Trapezio : %.3f\n", trapezio);
        System.out.printf("Quadrado : %.3f\n", quadrado);
        System.out.printf("Retangulo : %.3f\n", retangulo);

        sc.close();






    }
    
}
