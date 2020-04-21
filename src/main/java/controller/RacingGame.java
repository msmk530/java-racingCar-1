package controller;

import domain.Car;
import domain.GameProgress;
import domain.WinnerProgress;
import view.InputView;
import view.OutputView;


public class RacingGame {

    public void run() {
        Car[] cars = GameProgress.makeCar(InputView.inputCarsName());
        int round = InputView.inputRound();

        for (int i = 0; i < round; i++) {
            GameProgress.progressAllRound(cars);
            OutputView.printMoveProgress(cars);
        }

        int winnerPosition = WinnerProgress.calculateWinnerPosition(cars);
        OutputView.printWinners(WinnerProgress.extractWinners(cars, winnerPosition));

    }

}