/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if(x>0.0 && y>0.0){
            System.out.println("Quadrante 1");
        }
        else if(x<0.0 && y>0.0){
            System.out.println("Quadrante 2");
        }
        else if(x>0.0 && y<0.0){
            System.out.println("Quadrante 4");
        }
        else if(x<0.0 && y<0.0){
            System.out.println("Quadrante 3");
        }
        else{
            System.out.println("Origem");
        }
        sc.close();
    }
}
