package v1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차_집합은_단독_우승자를_선정_할_수_있다() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("cat",1), new Car("dog",2)));

        // when
        cars = cars.getWinners();

        // then
        assertThat(cars.getCars()).hasSize(1)
                .extracting("name")
                .containsExactlyInAnyOrder("dog");
    }

    @Test
    void 자동차_집합은_공동_우승자를_선정_할_수_있다() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("cat",1), new Car("dog",2), new Car("tiger",2)));

        // when
        cars = cars.getWinners();

        // then
        assertThat(cars.getCars()).hasSize(2)
                .extracting("name")
                .containsExactlyInAnyOrder("dog", "tiger");;
    }

    @Test
    void 우승_자동차들의_이름을_가져온다() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("cat",1), new Car("dog",2), new Car("tiger",2)));
        cars = cars.getWinners();

        // when
        final String winnersName = cars.getWinnersName();

        // then
        assertThat(winnersName).isEqualTo("dog, tiger");
    }

}
