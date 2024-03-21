package v1;

public class FuelValidationUtils {

    private static final int MIN_NUM = 4;
    private static final int MAX_NUM = 9;

    public static boolean isSufficient(int fuel) {
        return MIN_NUM <= fuel && fuel <= MAX_NUM;
    }
}
