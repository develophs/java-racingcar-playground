package v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringSplitTest {

    @Test
    void split() {
        // given
        final StringSplit stringSplit = new StringSplit("cat,dog,monkey");

        // when
        final String[] result = stringSplit.split(",");

        // then
        assertThat(result).hasSize(3);
    }
}