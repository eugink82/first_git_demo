package first_package;

public class Car {
    private int number;
    private String color;

    public Car(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
