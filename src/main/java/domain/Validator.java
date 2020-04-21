package domain;

public class Validator {
    private static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 1글자 이상 5글자 이하여야 합니다.";
    private static final String ROUND_NUMBER_ERROR_MESSAGE = "최소 1라운드 이상 입력하셔야 합니다.";
    private static final int MINIMUM_CAR_NAME_LENGTH = 1;
    private static final int MAXIMUM_CAR_NAME_LENGTH = 5;
    private static final int MINIMUM_ROUND_NUMBER = 1;

    public static boolean isValidNameLength(String[] allCarOfRacingGame) {
        for (String carName : allCarOfRacingGame) {
            if (carName.length() < MINIMUM_CAR_NAME_LENGTH || carName.length() > MAXIMUM_CAR_NAME_LENGTH) {
                System.out.println(CAR_NAME_LENGTH_ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRoundNumber(int round) {
        if (round < MINIMUM_ROUND_NUMBER) {
            System.out.println(ROUND_NUMBER_ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
