package v1;


public class Client {

    public static void main(String[] args) {
        final Reader reader = new Reader();
        final String carName = reader.readCarName();
        final int gameRound = reader.readGameRound();
        final Cars cars = CarFactory.getInstance().constructCars(carName);
        cars.play(gameRound);

    }
}
