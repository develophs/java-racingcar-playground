package v1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @ParameterizedTest
    @CsvSource({"4,1", "9,1"})
    void 자동차는_4이상_9이하의_연료를_받는경우_1칸_전진할_수_있다(int fuel, int expectedStep) {
        // given
        Car car = new Car("name");

        // when
        car.proceed(fuel);

        // then
        assertThat(car.steps()).isEqualTo(expectedStep);
    }

    @ParameterizedTest
    @CsvSource({"1,0", "2,0", "3,0"})
    void 자동차는_3이하_10이상의_연료를_받는경우_전진하지_않는다(int fuel, int expectedStep) {
        // given
        Car car = new Car("name");

        // when
        car.proceed(fuel);

        // then
        assertThat(car.steps()).isEqualTo(expectedStep);
    }

}
