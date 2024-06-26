package v2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차들의_집단_일급_콜렉션은_자동차_리스트로_생성_할_수_있다() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("dog"), new Car("cat")));

        // when
        // then
        assertThat(cars).isNotNull();
    }

    @Test
    void 자동차들의_집단_일급_콜렉션_등록된_자동차들을_가져온다() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("dog"), new Car("cat")));

        // when
        final List<Car> car = cars.getCars();

        // then
        assertThat(car).hasSize(2)
                .containsExactly(new Car("dog"), new Car("cat"));
    }

    @Test
    void 자동차들의_집단_일급_콜렉션은_위치값이_가장_큰_우승자들을_선별_할_수_있다() {
        // given
        Cars cars = new Cars(Arrays.asList(
                new Car("dog", 3),
                new Car("cat", 3),
                new Car("eagle", 2)
        ));

        // when
        final List<Car> winner = cars.getWinners();

        // then
        assertThat(winner).hasSize(2)
                .containsExactly(new Car("dog", 3), new Car("cat", 3));
    }

}
