package v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @Test
    void 자동차의_이름을_가지는_불변_객체_생성() {
        // given
        CarName carName = new CarName("dog");

        // when
        boolean isEqual = carName.equals(new CarName("dog"));

        // then
        assertThat(isEqual).isTrue();
    }

    @Test
    void 자동차의_이름을_가지는_불변_객체는_이름이_빈값일_수_없다() {
        // given
        // when
        // then
        assertThatThrownBy(() -> new CarName(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름이 빈값일 수 없습니다.");
    }

}
