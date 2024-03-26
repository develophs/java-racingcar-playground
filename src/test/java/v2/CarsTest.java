package v2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차들의_집단_일급_콜렉션() {
        // given
        Cars cars = new Cars(Arrays.asList(new Car("dog"), new Car("cat")));

        // when
        Car dog = cars.get(0);
        Car cat = cars.get(1);

        // then
        assertThat(dog).isEqualTo(new Car("dog"));
        assertThat(cat).isEqualTo(new Car("cat"));
    }

}
