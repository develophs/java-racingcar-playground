package v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringSplitterTest {

    @Test
    void 문자열을_받아_구분자로_나눌_수_있다() {
        // given
        StringSplitter splitter = new StringSplitter("강아지,고양이,호랑이");
        
        // when
        String[] carNames = splitter.split(",");
        
        // then
        assertThat(carNames).hasSize(3);
        assertThat(carNames[0]).isEqualTo("강아지");
        assertThat(carNames[1]).isEqualTo("고양이");
        assertThat(carNames[2]).isEqualTo("호랑이");
    }

    @Test
    void 문자열은_빈값으로_작성_할_수_없다() {
        // given
        String input = "";

        // when, then
        assertThatThrownBy(() -> new StringSplitter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차들의 이름은 필수입니다.");
    }

    @Test
    void 문자열은_null로_작성_할_수_없다() {
        // given
        String input = null;

        // when, then
        assertThatThrownBy(() -> new StringSplitter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차들의 이름은 필수입니다.");
    }

}
