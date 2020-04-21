package view;

import domain.Car;

import java.util.List;

public class OutputView {

    public static final String SEPARATOR_FOR_CAR_NAME = ",";
    public static final String PRINT_WINNER_MESSAGE = "가 우승하였습니다.";

    public static void printMoveProgress(Car[] cars) {
        for (Car car : cars) {
            car.printPosition();
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public static void printWinners(List<String> winners) {
        String result = String.join(SEPARATOR_FOR_CAR_NAME, winners);
        System.out.println(result + PRINT_WINNER_MESSAGE);
    }
}
