package pacoteExercicioFixacao2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return (grossSalary - tax);
    }
    public void increaseSalary(double porcentage){
        porcentage = porcentage/100;
        this.grossSalary += porcentage*grossSalary; 
    }
    public String toString(){
        return "Employee: "
        + name
        +", $ "
        + String.format("%.2f%n", netSalary());
    }
    public String toStringNewFormation(){
        return "Updated data: "
        + name
        + ", $ "
        + String.format("%.2f", netSalary());
    }
}
