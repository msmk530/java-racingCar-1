package domain;

import util.RandomNumberGenerator;

public class Car {
    private static final String INDICATION_CAR_MOVE = "-";
    private static final int START_POSITION = 0;
    private static final int POSSIBLE_NUMBER_FOR_MOVE = 4;

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = START_POSITION;
    }

    public void updatePosition() {
        int random = RandomNumberGenerator.generateRandomNumber();
        if (random >= POSSIBLE_NUMBER_FOR_MOVE) {
            position++;
        }
    }

}

