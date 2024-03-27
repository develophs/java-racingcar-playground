package v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void 레이싱게임_객체는_경기_종료_여부를_알_수_있다() {
        // given
        Game game = new Game("dog,cat", 1);
        game.race();

        // when
        boolean end = game.isEnd();

        // then
        assertThat(end).isTrue();
    }
}
