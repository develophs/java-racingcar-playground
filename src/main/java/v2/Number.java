package v2;

import java.util.Random;

public class Number {
    private static final int MAX_BOUND = 10;

    public static int getRandomNumber() {
        return new Random().nextInt(MAX_BOUND);
    }
}
