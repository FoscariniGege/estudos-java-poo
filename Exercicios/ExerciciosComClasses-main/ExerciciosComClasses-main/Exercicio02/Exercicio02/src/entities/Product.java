package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueStock(){
        return price*quantity;
    }

    public void AddProducts(int quantidade){
        quantity+=quantidade;
    }
    public void RemoveProducts(int quantidade){
        quantity-=quantidade;
    }
    public String toString(){
       return String.format("--------------------------------------------------------------------------%n"+
                            "Nome: %s%n"+
                            "Preço: %.2f%n"+
                            "Quantidade: %d%n"+
                            "Total do estoque: %.2f%n"+
                            "--------------------------------------------------------------------------%n"
                            ,name,price,quantity,TotalValueStock());
    }
}
