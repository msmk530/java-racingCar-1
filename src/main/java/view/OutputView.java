package view;

import domain.Car;

public class OutputView {

    public static void printMoveProgress(Car[] cars) {
        for (Car car : cars) {
            car.printPosition();
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
}
