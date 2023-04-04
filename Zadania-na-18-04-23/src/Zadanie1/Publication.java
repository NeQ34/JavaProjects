package Zadanie1;

public class Publication {
    private String title;
    private String ident;
    private double price;
    private int quantity;

    public Publication(String title, String ident, double price, int quantity) {
        this.title = title;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }
    //settery:
    public void setTitle(String title) {this.title = title;}
    public void setIdent(String ident) {this.ident = ident;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    //gettery:
    public String getTitle() {return title;}
    public String getIdent() {return ident;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    //metody:
    public void buy(int n){quantity+=n;}
    public void raise(double procent){
        price*=(1+procent/100);
        price = Math.round(price*100)/100.0;//zaokraglenie do 2 miejsc po przecinku
    }
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "title: " + title +
                "\nident: " + ident +
                "\nprice: " + price +
                "\nquantity: " + quantity;
    }
}
