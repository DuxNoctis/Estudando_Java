/*
 *  
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.
 */

import java.util.Scanner;

public class ExercicioWhile3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, verificador;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        verificador = sc.nextInt();

        while(verificador !=0){
            if(verificador>=5 || verificador<=0){
                verificador = sc.nextInt();  
                } 
            if(verificador == 1){
                alcool +=1;
                verificador = sc.nextInt();
            }
                
            else if(verificador == 2){
                        gasolina +=1;
                        verificador = sc.nextInt();
            }
            else if(verificador == 3){
                diesel+=1;
                verificador = sc.nextInt();
            }
            else if(verificador == 4){
            System.out.println("Muito Obrigada");
            System.out.printf("Alcool: %d\n", alcool);
            System.out.printf("Gasolina: %d\n", gasolina);
            System.out.printf("Diesel: %d\n", diesel);
            verificador +=666;
            }   
          
        }
    sc.close();
    }
}
