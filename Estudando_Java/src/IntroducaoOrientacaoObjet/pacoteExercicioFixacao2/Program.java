package pacoteExercicioFixacao2;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee funcionary = new Employee();
        System.out.print("Name: ");
        funcionary.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionary.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionary.tax = sc.nextDouble();

        System.out.println(funcionary.toString());
        System.out.print("Which percentage to increase salary? %n");
        double percentage = sc.nextDouble();
        funcionary.increaseSalary(percentage);
        System.out.println(funcionary.toStringNewFormation());


        sc.close();
    }
}
