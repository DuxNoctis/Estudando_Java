/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaTermino;

        System.out.println("Digite a hora de inicio do jogo e a hora final: ");
        
        horaInicio = sc.nextInt();
        horaTermino = sc.nextInt();
        
        int duracao;

     
        if (horaInicio < horaTermino) {
            duracao = horaTermino - horaInicio;
        }
        
        else if (horaInicio > horaTermino) {
            duracao = 24 - horaInicio + horaTermino;
        }
      
        else {
            duracao = 24;
        }

        System.out.printf("O jogo durou %d hora(s)%n", duracao);

        sc.close();
    }
}
