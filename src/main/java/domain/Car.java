package domain;

import util.RandomNumberGenerator;

import java.util.Objects;

public class Car {
    private static final String INDICATION_CAR_MOVE = "-";
    private static final String COLON_FOR_CAR_MOVE = " : ";
    private static final int POSSIBLE_NUMBER_FOR_MOVE = 4;
    private static final int START_POSITION = 0;

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = START_POSITION;
    }

    public void updatePosition(int random) {
        if (isCarMove(random)) {
            position++;
        }
    }

    boolean isCarMove(int random) {
        if (random >= POSSIBLE_NUMBER_FOR_MOVE) {
            return true;
        }
        return false;
    }

    public void printPosition() {
        System.out.print(name + COLON_FOR_CAR_MOVE);
        for (int i = 0; i < position; i++) {
            System.out.print(INDICATION_CAR_MOVE);
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

}

