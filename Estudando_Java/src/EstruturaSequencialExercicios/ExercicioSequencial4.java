import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

public class ExercicioSequencial4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int funcNumber, hour;
        double value, salary;

        funcNumber = sc.nextInt();
        hour = sc.nextInt();
        Locale.setDefault(Locale.US);
        value = sc.nextDouble();

        salary = (double)hour*value;

        System.out.printf("NUMBER = %d\n", funcNumber);
        System.out.printf("SALARY = U$ %.2f", salary);


        sc.close();
    }
}
