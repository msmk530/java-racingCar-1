package controller;

import domain.Car;
import domain.GameProgressService;
import domain.WinnerProgressService;
import view.InputView;
import view.OutputView;

import java.util.List;


public class RacingGame {
    public void run() {
        List<Car> cars = GameProgressService.makeCar(InputView.inputCarNames());
        int round = InputView.inputRound();

        for (int i = 0; i < round; i++) {
            GameProgressService.progressRound(cars);
            OutputView.printMoveProgress(cars);
        }

        int winnerPosition = WinnerProgressService.calculateWinnerPosition(cars);
        OutputView.printWinners(WinnerProgressService.extractWinners(cars, winnerPosition));
    }
}