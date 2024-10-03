import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario;
        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        if(salario>=2000.00){
            System.out.println("Isento de imposto");
        }
        else if(salario>2000.01 && salario==3000.00){
            
        }
        sc.close();
    }
}
