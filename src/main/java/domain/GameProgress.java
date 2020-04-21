package domain;

import util.RandomNumberGenerator;

import java.util.List;

public class GameProgress {
    private GameProgress() {
        throw new AssertionError();
    }

    public static Car[] makeCar(List<String> allCarOfRacingGame) {
        Car[] cars = new Car[allCarOfRacingGame.size()];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(allCarOfRacingGame.get(i).trim());
        }

        return cars;
    }

    public static void progressRound(Car[] cars) {
        for (Car car : cars) {
            car.updatePosition(RandomNumberGenerator.generateRandomNumber());
        }
    }
}
