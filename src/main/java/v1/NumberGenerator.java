package v1;

import java.util.Random;

public class NumberGenerator {

    private static final int LIMIT = 10;

    public int generate() {
        Random random = new Random();
        return random.nextInt(LIMIT);
    }

}
