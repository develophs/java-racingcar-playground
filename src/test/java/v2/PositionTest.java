package v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {

    @Test
    void 자동차의_위치값을_가지는_포지션_객체를_생성_할_수_있다() {
        // given
        Position position = new Position(3);

        // when
        boolean isEqual = position.equals(new Position(3));

        // then
        assertThat(isEqual).isTrue();
    }

    @Test
    void 자동차의_위치값을_가지는_포지션_객체는_0이상의_상태를_가져야한다() {
        // given
        // when
        // then
        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 이상의 상태를 가져야합니다.");
    }

    @Test
    void 불변_객체인_포지션의_move_메서드는_4이상의_수를_받을경우_상태값이_1증가한_새로운_객체를_생성한다() {
        // given
        final Position position = new Position(0);

        // when
        Position newPosition = position.move(4);

        // then
        assertThat(newPosition).isEqualTo(new Position(1));
    }

    @Test
    void 불변_객체인_포지션의_move_메서드는_3이하의_수를_받을경우_위치_상태는_변경되지_않는다() {
        // given
        final Position position = new Position(1);

        // when
        Position newPosition = position.move(3);

        // then
        assertThat(newPosition).isEqualTo(new Position(1));
    }

    @Test
    void 포지션은_자신의_상태를_확인할_수_있다() {
        // given
        Position position = new Position(3);

        // when
        final boolean isSame = position.isSame(3);

        // then
        assertThat(isSame).isTrue();
    }



}
