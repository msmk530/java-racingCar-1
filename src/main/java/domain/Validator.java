package domain;

import com.sun.org.apache.bcel.internal.generic.DUP;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 1글자 이상 5글자 이하여야 합니다.";
    private static final String ROUND_NUMBER_ERROR_MESSAGE = "최소 1라운드 이상 입력하셔야 합니다.";
    private static final String DUPLICATE_NAME_ERROR_MESSAGE = "중복된 이름은 입력할 수 없습니다.";
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

    public static boolean isDuplicatedName(String[] allCarOfRacingGame) {
        Set<String> duplicateValidator = new HashSet<>();

        for (String carName : allCarOfRacingGame) {
            duplicateValidator.add(carName);
        }

        if (allCarOfRacingGame.length != duplicateValidator.size()) {
            System.out.println(DUPLICATE_NAME_ERROR_MESSAGE);
            return false;
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
