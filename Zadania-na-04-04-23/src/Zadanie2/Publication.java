package Zadanie2;

public class Publication {
    private String title;
    private int ident;
    private double price;
    private int quantity;

    public Publication(String title, int ident, double price, int quantity) {
        this.title = title;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }
    //settery:
    public void setTitle(String title) {this.title = title;}
    public void setIdent(int ident) {this.ident = ident;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    //gettery:
    public String getTitle() {return title;}
    public int getIdent() {return ident;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    //metody:
    public void buy(int n){quantity+=n;}
    public void raise(double procent){price*=(1+procent/100);}
    public void display(){
        System.out.println("Tytul: "+title+"\nnumer: "+ident+"\ncena: "+price+"\nilosc: "+quantity);
    }

    @Override
    public String toString() {
        return "title: " + title +
                "\nident: " + ident +
                "\nprice: " + price +
                "\nquantity: " + quantity;
    }
}
