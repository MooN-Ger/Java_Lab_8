import java.util.Objects;

public class Car {

    private String name;
    private String color;
    private int power;

    public Car() {
        this.name = "name";
        this.color = "color";
        this.power = 0;
    }

    public Car(String name, String color, int power) {
        this.name = name;
        this.color = color;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, power);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
