package ArraysTests;

public class Kwadrat {
    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }
    public int pole(){
        return a*a;
    }
    public double obwod(){
        return 4*a;
    }

    @Override
    public String toString() {
        return "a:" + a+
                "\nPole: "+pole()+
                "\nObwod: "+obwod();
    }
}
