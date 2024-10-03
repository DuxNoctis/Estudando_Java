package pacoteExercicioFixacao1;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();
    
        System.out.println("Enter rectangle width and heigth: ");
        System.out.print("Width: ");
        retangle.width = sc.nextDouble();
        System.out.print("Height: ");
        retangle.height = sc.nextDouble();

        System.out.println(retangle);
        sc.close();
    }
}
