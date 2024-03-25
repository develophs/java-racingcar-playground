package v1;


public class Client {

    public static void main(String[] args) {
        final Reader reader = new Reader();
        final String carName = reader.readCarName();
        final int gameRound = reader.readGameRound();
        getWinnersName(carName, gameRound);
    }

    private static void getWinnersName(final String carName, final int gameRound) {
        final Cars cars = CarFactory.getInstance().constructCars(carName);
        cars.play(gameRound);
        final Cars winners = cars.getWinners();
        final String winnersName = winners.getWinnersName();
        System.out.println(winnersName + "가 최종 우승했습니다.");
    }
}
