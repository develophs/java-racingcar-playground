package v2.view;

import v2.StringSplit;

import java.util.Scanner;

/**
 * 예외 발생을 안시키고 재입력을 받을려고하니 코드가 너무 더러워졌다..
 * 리팩토링이 가능은 한걸까...
 * 아.... 예외 던지고 싶다.
 */
public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        String carNames;
        do {
            carNames = scanner.nextLine();
        } while (!isValidCarNames(carNames));
        return carNames;
    }

    private static boolean isValidCarNames(String carNames) {
        for (String name : splitCarNames(carNames)) {
            if (isValid(name.trim())) {
                System.out.println("자동차의 이름은 0글자 이상 5글자 이하여야 합니다. 다시 입력해주세요.");
                return false;
            }
        }
        return true;
    }

    private static String[] splitCarNames(final String carNames) {
        final StringSplit stringSplit = new StringSplit(carNames);
        final String[] split = stringSplit.split(",");
        return split;
    }

    private static boolean isValid(final String trimmedName) {
        return trimmedName.length() > 5 || trimmedName.length() == 0;
    }

    public static int getRacingRound() {
        System.out.println("시도할 회수는 몇회인가요?");
        int round = 0;
        boolean positive = false;
        while (!positive) {
            String input = scanner.nextLine();
            if (isBlank(input)) {
                System.out.println("레이싱 라운드를 입력해주세요");
                continue;
            }
            try {
                round = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
            positive = isPositive(round);
            if (!positive) {
                System.out.println("레이싱 라운드는 양수를 입력해주세요");
            }
        }
        return round;
    }

    private static boolean isBlank(final String input) {
        if ("".equals(input)) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(final int round) {
        return round > 0;
    }

}
