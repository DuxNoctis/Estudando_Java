package pacoteMaterialExemplo;

public class Product {
    public String name;
    public double price;
    public int qtdd;


    public double totalValueInStock(){
        return price*qtdd;
    }

    public void addProducts(int qtdd){
        this.qtdd += qtdd;
    }

    public void removeProdutcs(int qtdd){
        this.qtdd -= qtdd;
    }
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f",price)
            +", "
            + qtdd
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());
    }
}
