package domain;

import util.RandomNumberGenerator;

public class RandomNumberMovingStrategy implements CarMovingStrategy {

    @Override
    public int generate() {
        return RandomNumberGenerator.generateRandomNumber();
    }
}
