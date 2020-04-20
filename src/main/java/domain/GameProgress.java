package domain;

import util.RandomNumberGenerator;
import view.OutputView;

public class GameProgress {

    public static void moveProgress(Car[] cars){
            for(Car car : cars){
                car.updatePosition(RandomNumberGenerator.generateRandomNumber());
                OutputView.printGameProgress(car);
            }
    }
}
