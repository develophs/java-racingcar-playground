package v2.view;

import java.util.Scanner;

public class InputView {

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        final Scanner scanner = new Scanner(System.in);
        String carNames = null;
        boolean pass = false;
        while (!pass) {
            carNames = scanner.nextLine();
            pass = isPass(carNames);
            System.out.println("자동차들의 이름을 다시 입력해주세요");
        }
        return carNames;
    }

    public static int getRacingRound() {
        System.out.println("시도할 회수는 몇회인가요?");
        final Scanner scanner = new Scanner(System.in);
        int round = 0;
        boolean positive = false;
        while (!positive) {
            round = Integer.valueOf(scanner.nextLine());
            positive = isPositive(round);
            System.out.println("레이싱 라운드는 양수를 입력해주세요");
        }
        return round;
    }

    private static boolean isPass(String carNames) {
        return !"".equals(carNames.trim());
    }

    private static boolean isPositive(final int round) {
        return round > 0;
    }

}
