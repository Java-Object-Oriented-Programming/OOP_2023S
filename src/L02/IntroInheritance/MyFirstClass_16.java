package L02.IntroInheritance;

import java.text.*;

public class MyFirstClass_16 {

    public static void main(String[] args) {

        //new Car() - this creates in the heap a new object of tha "Car" class
        //and the address of this object is stored to the "myCar1"
        Car myCar1 = new Car();
        myCar1.setPrice(1000);
        myCar1.setNumOfWheels(4);

        System.out.println(MessageFormat.format("Car 1 costs: {0}, and has {1} wheels", myCar1.getPrice(), myCar1.getNumOfWheels()));
        System.out.println(myCar1.GetDescription());

        //new Car() - this creates in the heap a new object of tha "Car" class
        //and the address of this object is stored to the "myCar2"
        Car myCar2 = new Car();
        myCar2.setPrice(2000);
        myCar2.setNumOfWheels(5);

        System.out.println(MessageFormat.format("Car 1 costs: {0}, and has {1} wheels", myCar2.getPrice(), myCar2.getNumOfWheels()));
        System.out.println(myCar2.GetDescription());

        if (new Car() instanceof Object)
            System.out.println("yes");
    }

}
