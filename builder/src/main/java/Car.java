public class Car {
    private final String model;
    private final String description;
    private final String fuelType;
    private final int speed;
    private final Colour colour;

    public Car(String model, String description, String fuelType, int speed, Colour colour) {
        this.model = model;
        this.description = description;
        this.fuelType = fuelType;
        this.speed = speed;
        this.colour = colour;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", speed=" + speed +
                ", colour=" + colour +
                '}';
    }
}
