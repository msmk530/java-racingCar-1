package domain;

import util.RandomNumberGenerator;

public class GameProgress {

    public static Car[] makeCar(String[] allCarOfRacingGame) {
        Car[] cars = new Car[allCarOfRacingGame.length];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(allCarOfRacingGame[i].trim());
        }

        return cars;
    }

    public static void progressRound(Car[] cars) {
        for (Car car : cars) {
            car.updatePosition(RandomNumberGenerator.generateRandomNumber());
        }
    }

}
