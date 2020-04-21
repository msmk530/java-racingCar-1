package controller;

import domain.Car;
import domain.GameProgress;
import domain.WinnerProgress;
import view.InputView;
import view.OutputView;


public class RacingGame {

    public void run() {
        String[] carsName = InputView.inputCarsName();
        Car[] cars = GameProgress.makeCar(carsName);
        int round = InputView.inputRound();

        for (int i = 0; i < round; i++) {
            GameProgress.progressRound(cars);
            OutputView.printMoveProgress(cars);
        }

        int winnerPosition = WinnerProgress.calculateWinnerPosition(cars);
        OutputView.printWinners(WinnerProgress.extractWinners(cars, winnerPosition));

    }

}