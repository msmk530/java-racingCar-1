package view;

import domain.Car;
import util.RandomNumberGenerator;

public class OutputView {

    public static void printGameProgress(Car car) {
        car.printPosition();
        System.out.print("\n");
    }
}
