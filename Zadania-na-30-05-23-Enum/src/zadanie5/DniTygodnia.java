package zadanie5;

public enum DniTygodnia {
    PONIEDZIALEK(false),
    WTOREK(false),
    SRODA(false),
    CZWARTEK(false),
    PIATEK(false),
    SOBOTA(true),
    NIEDZIELA(true);

    private boolean weekend;

    DniTygodnia(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend(){
        return weekend;
    }
}
