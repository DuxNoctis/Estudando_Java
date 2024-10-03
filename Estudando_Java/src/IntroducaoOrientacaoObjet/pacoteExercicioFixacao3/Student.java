package pacoteExercicioFixacao3;

public class Student {
    String nome;
    double nota1, nota2, nota3, notaFinal,points;
    

    public double finalMedia(){
        return this.notaFinal = (nota1+nota2+nota3);
    }

    public double missingPoints(){
        return this.points = 100 - notaFinal;
    }

    public String toString(){
        return "FINAL GRADE = "
        + String.format("%.2f",this.notaFinal)
        +"\nFAILED\n"
        + "MISSING: "
        + String.format("%.2f", missingPoints())
        + " POINTS";
           
    }
}
