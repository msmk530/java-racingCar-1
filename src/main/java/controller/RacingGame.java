package controller;

import domain.Car;
import domain.GameProgress;
import view.InputView;


public class RacingGame {

    public void run() {
        String[] allCarOfRacingGame = InputView.inputCarsName();
        int round = InputView.inputRound();
        Car[] cars = makeCar(allCarOfRacingGame);

        gameProgress(round, cars);


    }

    private Car[] makeCar(String[] allCarOfRacingGame) {
        Car[] cars = new Car[allCarOfRacingGame.length];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(allCarOfRacingGame[i].trim());
        }

        return cars;
    }

    private void gameProgress(int round, Car[] cars) {
        for (int i = 0; i < round; i++) {
            GameProgress.moveProgress(cars);
            System.out.print("\n\n");
        }
    }


}