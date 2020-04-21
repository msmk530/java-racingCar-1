package domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WinnerCar {

    public static int calculateWinnerPosition(Car[] cars){
        int winnerPostion;
        List<Integer> carsPosition = new LinkedList<>();

        for (Car car : cars) {
            carsPosition.add(car.getPosition());
        }
        Collections.sort(carsPosition);

        return carsPosition.get(carsPosition.size()-1);
    }



}
