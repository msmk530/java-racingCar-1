package domain;

public class Car {
    private static final int START_POSITION = 0;

    private String name;
    private int position;

    public Car(String name) {
            this.name = name;
            this.position = START_POSITION;
        }
}

