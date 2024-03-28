package v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarFactoryTest {

    @Test
    void 팩토리_객체로_자동차를_생성_할_수_있다() {
        // given
        CarFactory factory = CarFactory.getInstance();

        // when
        Car car = factory.construct("carName");

        // then
        assertThat(car).isNotNull();
        assertThat(car.getName()).isEqualTo("carName");
        assertThat(car.steps()).isEqualTo(0);
    }

    @Test
    void 팩토리_객체로_자동차를_여러대_생성_할_수_있다() {
        // given
        CarFactory factory = CarFactory.getInstance();

        // when
        Cars cars = factory.constructCars("고양이,강아지,호랑이");

        // then
        assertThat(cars).isNotNull();
        assertThat(cars.getCarNameByIndex(0)).isEqualTo("고양이");
        assertThat(cars.getCarNameByIndex(1)).isEqualTo("강아지");
        assertThat(cars.getCarNameByIndex(2)).isEqualTo("호랑이");
    }
}
