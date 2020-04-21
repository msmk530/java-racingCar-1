package domain;

import util.RandomNumberGenerator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GameProgress {

    public static Car[] makeCar(String[] allCarOfRacingGame) {
        Car[] cars = new Car[allCarOfRacingGame.length];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(allCarOfRacingGame[i].trim());
        }

        return cars;
    }

    public static void progressAllRound(Car[] cars) {
        updatePositionProgress(cars);
    }

    private static void updatePositionProgress(Car[] cars) {
        for (Car car : cars) {
            car.updatePosition(RandomNumberGenerator.generateRandomNumber());
        }
    }

    public static int calculateWinnerPosition(Car[] cars) {
        int winnerPostion;
        List<Integer> carsPosition = new LinkedList<>();

        for (Car car : cars) {
            carsPosition.add(car.getPosition());
        }
        Collections.sort(carsPosition);

        return carsPosition.get(carsPosition.size() - 1);
    }


}
