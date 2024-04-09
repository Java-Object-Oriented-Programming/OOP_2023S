package L02.IntroInheritance;

import java.text.MessageFormat;

//הגדרת תבנית שלא תופסת מקום בפועל בזיכרון
//אלא מאפשרת ליצור ממנה מופעים לפי הגדרתה
public class Car {
    //-------------Properties--------------

    private String type;
    private String color;
    private Engine engine;
    private int NumOfWheels;
    private long Price;

    //-------------Methods--------------
    public String GetDescription() {
        return MessageFormat.format("Car costs: {0}, and has {1} wheels", Price, NumOfWheels);
    }

    //------------Constructor------------
    public Car(int numOfWheels, long price) {
        NumOfWheels = numOfWheels;
        Price = price;
    }

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
        //100fff
        engine = new Engine("aum", 180);
    }

    //------------copy Constructor------------
    public Car(Car other) {
        this.type = other.type;
        this.color = other.color;
        this.engine = new Engine(other.engine);
    }

    //------------polymorphism - Constructor------------
    public Car() {
    }


//------------- Getter + Setter --------------

    public int getNumOfWheels() {
        return NumOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        if (numOfWheels < 15 && numOfWheels >= 4)
            NumOfWheels = numOfWheels;
    }

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}' + super.toString() + "\n";
    }
}

class Engine {
    String type;
    int hp;

    public Engine(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }

    public Engine(Engine other) {
        this.type = other.type;
        this.hp = other.hp;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", hp=" + hp +
                '}';
    }
}

class TestCar {

    public static void main(String[] args) {
        Car audi = new Car("Audi", "Black");
        System.out.println(audi);
        Car audiVersion2 = new Car(audi);

        System.out.println(audiVersion2);

        audi.getEngine().hp = 890;
        System.out.println(audi);
        System.out.println(audiVersion2);
    }
}
