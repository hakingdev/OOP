package auto;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Car {
    public String brand;
    String model;
    private double motorDisplacement;
    private String transmission;
    private String body;
    private String fuel;
    private int horsepower;

    public Car() {

    }

    public Car(String model) {
        if (model == null) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.model = model;
    }

    public Car(String model, double motorDisplacement){
        this.model = Objects.requireNonNull(model, "Напишите модель");
        this.motorDisplacement = motorDisplacement;
    }

    public Car (String model, double motorDisplacement, String transmission){
        this(model, motorDisplacement);
        this.transmission = transmission;
    }

    public Car (String model, double motorDisplacement, String transmission, String body){
        this(model, motorDisplacement, transmission);
        this.body = body;
    }

    public Car(Car original) {
        this(original.model, original.motorDisplacement, original.transmission, original.body);
        this.fuel = original.fuel;
        this.horsepower = original.horsepower;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.model = model;
    }

    public double getMotorDisplacement() {
        return motorDisplacement;
    }

    public void setMotorDisplacement(double motorDisplacement) {
        if (motorDisplacement == 0) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.motorDisplacement = motorDisplacement;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (model == null) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (model == null) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.body = body;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if (model == null) {
            throw new NullPointerException("Не может быть пустым");
        }
        this.fuel = fuel;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower < 1) {
            throw new NullPointerException("Не может быть меньше 1го");
        }
        this.horsepower = horsepower;
    }

}
