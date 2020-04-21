package domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WinnerProgress {
    public static int calculateWinnerPosition(Car[] cars) {
        List<Integer> carsPosition = new LinkedList<>();

        for (Car car : cars) {
            carsPosition.add(car.getPosition());
        }
        Collections.sort(carsPosition);

        return carsPosition.get(carsPosition.size() - 1);
    }

    public static List<String> extractWinners(Car[] cars, int winnerPosition) {
        List<String> winners = new LinkedList<>();
        for (Car car : cars) {
            if (car.getPosition() == winnerPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}
