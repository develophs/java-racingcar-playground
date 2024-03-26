package v2;

import java.util.Objects;

public class CarName {
    private final String carName;

    public CarName(final String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    private void validateCarName(final String carName) {
        if ("".equals(carName.trim()) || carName == null) {
            throw new IllegalArgumentException("자동차의 이름이 빈값일 수 없습니다.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName1 = (CarName) o;
        return Objects.equals(carName, carName1.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }

    @Override
    public String toString() {
        return carName;
    }
}
