package domain;

public class PossibleCarMovingStrategyMock implements CarMovingStrategy {
    private static final int POSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION = 4;

    @Override
    public int generate() {
        return POSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION;
    }
}
