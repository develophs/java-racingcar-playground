package v2;

import v2.view.InputView;
import v2.view.ResultView;

public class RacingMain {

    public static void main(String[] args) {
        final String carNames = InputView.getCarNames();
        final int racingRound = InputView.getRacingRound();

        final Game game = new Game(carNames, racingRound);
        while (!game.isEnd()) {
            game.race();
            ResultView.printStatus(game.getCurrentCars());
        }
        ResultView.printWinner(game.getWinners());
    }
}
