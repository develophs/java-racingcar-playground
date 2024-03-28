package v1;

public class CarNameValidationUtils {

    private static final int LENGTH_LIMIT = 5;

    public static void validateCarNames(final String[] carNames) {
        for (String carName : carNames) {
            validateCarName(carName);
        }
    }

    private static void validateCarName(final String carName) {
        if (isValid(carName)) {
            throw new IllegalArgumentException("자동차의 이름은 한글자 이상 다섯글자 이하여야 합니다.");
        }
    }

    private static boolean isValid(final String carName) {
        return "".equals(carName) || LENGTH_LIMIT < carName.length();
    }

}
