package controller;

import domain.Car;
import domain.GameProgress;
import domain.WinnerProgress;
import view.InputView;
import view.OutputView;

import java.util.List;


public class RacingGame {
    public void run() {
        List<String> carNames = InputView.inputCarNames();
        Car[] cars = GameProgress.makeCar(carNames);
        int round = InputView.inputRound();

        for (int i = 0; i < round; i++) {
            GameProgress.progressRound(cars);
            OutputView.printMoveProgress(cars);
        }

        int winnerPosition = WinnerProgress.calculateWinnerPosition(cars);
        OutputView.printWinners(WinnerProgress.extractWinners(cars, winnerPosition));
    }
}