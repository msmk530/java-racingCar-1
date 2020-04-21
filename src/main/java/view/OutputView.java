package view;

import domain.Car;

import java.util.List;

public class OutputView {
    public static final String COLON_FOR_CAR_MOVE = " : ";
    public static final String INDICATION_CAR_MOVE = "-";
    public static final String SEPARATOR_FOR_CAR_NAME = ",";
    public static final String PRINT_WINNER_MESSAGE = "가 우승하였습니다.";

    public static void printMoveProgress(Car[] cars) {
        for (Car car : cars) {
            int carPosition = car.getPosition();
            String carName = car.getName();
            currentPositionPrint(carName,carPosition);
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    private static void currentPositionPrint(String carName, int carPosition) {
        System.out.print(carName + COLON_FOR_CAR_MOVE);
        for (int i = 0; i < carPosition; i++) {
            System.out.print(INDICATION_CAR_MOVE);
        }
    }

    public static void printWinners(List<String> winners) {
        String result = String.join(SEPARATOR_FOR_CAR_NAME, winners);
        System.out.println(result + PRINT_WINNER_MESSAGE);
    }
}
