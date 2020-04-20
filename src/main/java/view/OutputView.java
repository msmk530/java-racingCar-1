package view;

import domain.Car;

public class OutputView {

    public static void printMoveProgress(Car car) {
        car.printPosition();
        System.out.print("\n");
    }
}
