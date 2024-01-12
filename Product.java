public class Product {
    double price= 6976;
    public double getPrice() {
        return price;
    }
    public double getPrice(int quant){
        return price*quant;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String args[]){
        Product p = new Product();
        System.out.println(p.getPrice(5));
    }
}
