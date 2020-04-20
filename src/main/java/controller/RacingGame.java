package controller;

import domain.Car;
import view.InputView;

public class RacingGame {

    public void run() {
        String[] allCarOfRacingGame = InputView.inputCarsName();
        int round = InputView.inputRound();
        Car[] cars = makeCar(allCarOfRacingGame);

    }

    private Car[] makeCar(String[] allCarOfRacingGame) {
        Car[] cars = new Car[allCarOfRacingGame.length];

        for(int i=0; i<cars.length; i++){
            cars[i] = new Car(allCarOfRacingGame[i].trim());
        }

        return cars;
    }

}