package v2;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void 레이싱게임_객체는_문자열로_자동차들을_등록한다() {
        // given
        Game game = new Game("dog,cat", 1);

        // when
        final List<Car> currentCars = game.getCurrentCars();

        // then
        assertThat(currentCars).hasSize(2)
                .contains(new Car("dog"), new Car("cat"));
    }

    @Test
    void 레이싱게임_객체는_우승자_선별을_일급콜렉션에_위임한다() {
        // given
        Game game = new Game("dog,cat,eagle", 1);

        // when
        final List<Car> winner = game.getWinners();

        // then
        assertThat(winner).hasSize(3)
                .contains(new Car("dog"), new Car("cat"), new Car("eagle"));
    }
}
