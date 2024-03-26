package v2;

import java.util.Objects;

public class Car {

    private final CarName carName;
    private Position position;

    public Car(final String carName) {
        this(carName, 0);
    }

    public Car(final String carName, final int position) {
        this.carName = new CarName(carName);
        this.position = new Position(position);
    }

    public boolean isSamePosition(final int position) {
        return this.position.isSame(position);
    }

    public void move(final int fuel) {
        position = position.move(fuel);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }

    @Override
    public String toString() {
        return carName + " : "+ position.toString();
    }
}
