package zadanie6;

public class Person {
    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public Person(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public EyeColor getEyeColor() {return eyeColor;}
    public HairColor getHairColor() {return hairColor;}

    @Override
    public String toString() {
        return "Imie: " + name +
                "\nWiek: " + age +
                "\nKolor oczu: " + eyeColor +
                "\nKolor wlosow: " + hairColor;
    }
}
