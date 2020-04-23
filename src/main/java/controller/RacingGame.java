package controller;

import domain.*;
import view.InputView;
import view.OutputView;

import java.util.List;


public class RacingGame {
    public void run() {
        List<Car> cars = GameProgressService.makeCar(InputView.inputCarNames());
        int round = InputView.inputRound();
        CarMovingStrategy strategy = new RandomNumberMovingStrategy();

        for (int i = 0; i < round; i++) {
            GameProgressService.progressRound(cars, strategy);
            OutputView.printMoveProgress(cars);
        }

        int winnerPosition = WinnerProgressService.calculateWinnerPosition(cars);
        OutputView.printWinners(WinnerProgressService.extractWinners(cars, winnerPosition));
    }
}