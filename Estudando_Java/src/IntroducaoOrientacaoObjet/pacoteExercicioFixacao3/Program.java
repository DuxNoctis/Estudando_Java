package pacoteExercicioFixacao3;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        student.finalMedia();
        if (student.notaFinal>=60.00){
            System.out.printf("FINAL GRADE = %.2f%nPASS", student.notaFinal);
        }
        else{
            System.out.println(student.toString());
        }
       
        



        sc.close();

    }
}
