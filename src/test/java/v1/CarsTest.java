package v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차_집합에_자동차를_추가_할_수_있다() {
        // given
        Cars cars = new Cars();

        // when
        cars.addCar(new Car("강아지"));
        cars.addCar(new Car("고양이"));

        // then
        assertThat(cars.getCars()).hasSize(2);
        assertThat(cars.getCarNameByIndex(0)).isEqualTo("강아지");
        assertThat(cars.getCarNameByIndex(1)).isEqualTo("고양이");
    }

}
