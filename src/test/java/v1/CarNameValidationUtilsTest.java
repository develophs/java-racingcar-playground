package v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameValidationUtilsTest {

    @Test
    void 자동차의_이름이_다섯글자_이하이면_통과한다() {
        // given
        String[] carNames = {"cat", "dog", "tiger", "lion"};

        // when, then
        CarNameValidationUtils.validateCarNames(carNames);
    }

    @Test
    void 자동차의_이름이_다섯글자_초과이면_예외가_발생한다() {
        // given
        String[] carNames = {"cat", "dog", "tiger", "monkey"};

        // when, then
        assertThatThrownBy(() -> CarNameValidationUtils.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 한글자 이상 다섯글자 이하여야 합니다.");
    }

    @Test
    void 자동차의_이름이_공백이면_예외가_발생한다() {
        // given
        String[] carNames = {"", "dog", "tiger", "lion"};

        // when, then
        assertThatThrownBy(() -> CarNameValidationUtils.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 한글자 이상 다섯글자 이하여야 합니다.");
    }
}
