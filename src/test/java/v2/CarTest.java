package v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 원시값을_포장한_자동차를_생성_할_수_있다() {
        // given
        Car car = new Car("dog", 0);

        // when
        boolean isEqual = car.equals(new Car("dog", 0));

        // then
        assertThat(isEqual).isTrue();
    }

    @Test
    void 자동차의_초기_위치_상태는_0이다() {
        // given
        Car car = new Car("dog");

        // when
        boolean isSame = car.isSamePosition(0);

        // then
        assertThat(isSame).isTrue();
    }

    @Test
    void 자동차는_연료를_4이상_받을_경우_1칸_전진한다() {
        // given
        Car car = new Car("dog", 0);

        // when
        car.move(4);

        // then
        assertThat(car.isSamePosition(1)).isTrue();
    }
}
