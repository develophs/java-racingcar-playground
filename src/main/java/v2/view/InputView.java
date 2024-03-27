package v2.view;

import v2.StringSplit;
import v2.common.exception.EmptyException;
import v2.common.exception.NegativeException;

import java.util.Scanner;

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
            if (isNotValid(name.trim())) {
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

    private static boolean isNotValid(final String trimmedName) {
        return trimmedName.length() > 5 || trimmedName.length() == 0;
    }

    public static int getRacingRound() {
        System.out.println("시도할 회수는 몇회인가요?");
        return getRound();
    }

    private static int getRound() {
        while (true) {
            try {
                String input = scanner.nextLine();
                validateBlank(input);
                int round = Integer.valueOf(input);
                validatePositive(round);
                return round;
            } catch (EmptyException | NumberFormatException | NegativeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validateBlank(final String input) {
        if ("".equals(input.trim())) {
            throw new EmptyException("레이싱 라운드를 입력해주세요");
        }
    }

    private static void validatePositive(final int round) {
        if (round <= 0) {
            throw new EmptyException("0보다 큰 수를 입력해주세요");
        }
    }

}
