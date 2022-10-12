public class CarBuilder {

    private String model;
    private String description;
    private String fuelType;
    private int speed;
    private Colour colour;

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder description(String description) {
        this.description = description;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder speed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarBuilder colour(Colour colour) {
        this.colour = colour;
        return this;
    }

    public Car build() {
        return new Car(model, description, fuelType, speed, colour);
    }
}
