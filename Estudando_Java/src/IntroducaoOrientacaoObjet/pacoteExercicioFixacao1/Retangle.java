package pacoteExercicioFixacao1;

public class Retangle {
    public double width;
    public double height;

    public double area(){
        return width*height;
    }

    public double perimeter(){
        return 2*(width+height);
    }

    public double diagonal(){
        return Math.sqrt((height*height)+(width*width));
    }

    public String toString(){
        return "AREA = "
            + String.format("%.2f%n", area())
            + "PERIMETER = "
            + String.format("%.2f%n", perimeter())
            + "DIAGONAL = "
            + String.format("%.2f", diagonal());

    }
}
