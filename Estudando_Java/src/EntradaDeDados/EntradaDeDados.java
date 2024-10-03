import java.util.Scanner; 

public class EntradaDeDados{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //associando o objeto Scanner sc, ao teclado

        String x;
        x = sc.next(); 
        System.out.println("Você digitou: "+ x);

        //para numeros inteiros utilizasse "nextInt()", ao invés de "next()"
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: "+ y);

        //para flutuantes utilizasse "nextDouble()"
        double n;
        n = sc.nextDouble();//nesse caso o numero digitado deve ser com os padrões de digitação do sistema, caso aja necessidade de outro tipo de separador(usar o Locale)
        System.out.println("Você digitou: "+ n);

        //para o caracteres "char" nos fazemos deste jeito "sc.next()" igual da string, porém, chamamos também outro metodo o "charAt(0)", metodo para pegar um caractere, dentro dos parametros passamos a posição
        char s;
        s = sc.next().charAt(0);
        System.out.println("Você digitou: "+ s);

        //para ele ler a linha toda usasse o nextLine()
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();//encerrar o recurso criado(quando não precisa mais dele)
    }
}
