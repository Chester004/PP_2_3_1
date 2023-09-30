package web.models;

public class Car {
    private String make;
    private String model;
    private int regNumber;

    public Car(String make, String model, int regNumber) {
        this.make = make;
        this.model = model;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", regNumber=" + regNumber +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }
}
