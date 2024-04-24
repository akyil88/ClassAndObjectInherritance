public class Car extends Vehicle {
    protected int numberOfWheels;
    protected int numberOfDoors;

    public Car(int numberOfDoors, int numberOfWheels) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors, int numberOfWheels) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfWheels=" + numberOfWheels +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}

