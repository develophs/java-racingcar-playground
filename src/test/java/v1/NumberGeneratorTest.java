package v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {

    @Test
    void 생성된_난수는_9이하_이다() {
        // given
        NumberGenerator numberGenerator = new NumberGenerator();

        // when
        int randomFuel = numberGenerator.generate();

        // then
        assertThat(randomFuel).isLessThanOrEqualTo(9);
    }

    @Test
    void 생성된_난수는_0이상_이다() {
        // given
        NumberGenerator numberGenerator = new NumberGenerator();

        // when
        int randomFuel = numberGenerator.generate();

        // then
        assertThat(randomFuel).isGreaterThanOrEqualTo(0);
    }
}
