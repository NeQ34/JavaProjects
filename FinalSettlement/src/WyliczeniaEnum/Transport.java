package WyliczeniaEnum;

public enum Transport {
    AUTO(260),
    TIR(100),
    SAMOLOT(900),
    KOLEJ(300),
    STATEK(40);

    private int speed;
    Transport(int speed){this.speed = speed;}
    int getSpeed(){return speed;}
}
