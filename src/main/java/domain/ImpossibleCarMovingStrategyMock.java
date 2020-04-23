package domain;

public class ImpossibleCarMovingStrategyMock implements CarMovingStrategy {
    private static final int IMPOSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION = 3;

    @Override
    public int generate() {
        return IMPOSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION;
    }
}
