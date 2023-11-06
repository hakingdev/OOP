import auto.Car;
import auto.Plant;

public class Main {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.brand = "VW";
        auto.setModel("Sharan");
        System.out.println(auto.getModel());
        auto.setFuel("Diesel");
        System.out.println(auto.getFuel());
        auto.setTransmission("Automatik");
        System.out.println(auto.getTransmission());
        auto.setMotorDisplacement(2.2);
        System.out.println(auto.getMotorDisplacement());

        Car auto2 = new Car("Brabus", 2.5, "Automatik", "hatchback");
        auto2.brand = "Mercedes";
        System.out.println(auto2.getModel());
        System.out.println(auto2.getMotorDisplacement());
        System.out.println(auto2.getTransmission());
        System.out.println(auto2.getBody());

        Car cloned = new Car(auto2);
        auto2.brand = "Mercedes";
        auto2.setModel("S200");
        System.out.println(auto2.getModel());
        System.out.println(auto2.getMotorDisplacement());
        System.out.println(auto2.getTransmission());
        System.out.println(auto2.getBody());

        System.out.println(auto2 == cloned);

        Plant fabrik = new Plant();
        System.out.println(fabrik.getAutos());

    }
}