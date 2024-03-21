package v1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FuelValidationUtilsTest {

    @ParameterizedTest
    @CsvSource({"3,false", "4,true" , "9,true", "10, false"})
    void 연료량은_4이상_9이하인_경우에만_유효하다(int fuel, boolean expect) {
        // given
        // when
        final boolean result = FuelValidationUtils.isSufficient(fuel);

        //then
        assertThat(result).isEqualTo(expect);
    }
}
