/*
Funções Interessantes para Strings

*Formatação:
toLowerCase(): Transforma tudo em minúsculo
toUpperCase(): Transforma tudo em maiúsculo
trim(): Remover espaços em branco

*Recortar 
substring(inicio), substring(inicio, fim)

*Substituir caracter ou strings
Replace(char, char) , Replace(string, string)

*Buscar 
IndexOf
LastIndexOf

*Recortar String com base em um separador
str.Split("")
*/

//Exemplos
public class FuncoesStrings {
        public static void main(String[] args){
        String original = "-abcd FGHIJ ABC abc DEFG    -";
        String tudoMinusculo = original.toLowerCase();
        String tudoMaiusculo = original.toUpperCase();
        String semEspacoBranco = original.trim();
        String aPartirDoSegundo = original.substring(2); //poderia passar um ponto final tbm com substring(2,6)
        String trocarCaracter = original.replace("a", "r");
        int primeiraOcorrencia = original.indexOf("bc");
        int ultimaOcorrencia = original.lastIndexOf("bc");
        

        System.out.printf("Orginal: %s%n",original);
        System.out.printf("toLowerCase(): %s%n", tudoMinusculo);
        System.out.printf("toUpperCase(): %s%n", tudoMaiusculo);
        System.out.printf("trim(): %s%n", semEspacoBranco); //nao funciona
        System.out.printf("substring(): %s%n", aPartirDoSegundo);    
        System.out.printf("replace(): %s%n", trocarCaracter); 
        System.out.printf("IndexOf(): %s%n", primeiraOcorrencia);
        System.out.printf("lastIndexOf(): %s%n", ultimaOcorrencia);



        //Operação slip é um vetor
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        System.out.println(vect[1]);
    };
};
