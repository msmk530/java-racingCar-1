package view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력해주세요";
    private static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 1글자 이상 5글자 이하여야 합니다.";
    private static final String FOR_SPLIT_CARNAME = ",";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String ROUND_NUMBER_ERROR_MESSAGE = "최소 1라운드 이상 입력하셔야 합니다.";
    private static final int MINIMUM_CAR_NAME_LENGTH = 1;
    private static final int MAXIMUM_CAR_NAME_LENGTH = 5;
    private static final int MINIMUM_ROUND_NUMBER = 1;
    private static Scanner sc = new Scanner(System.in);

    public static String[] inputCarsName() {
        String carsName;
        String[] allCarOfRacingGame;
        do {
            System.out.println(INPUT_CARS_NAME_MESSAGE);
            carsName = sc.nextLine();
            allCarOfRacingGame = carsName.split(FOR_SPLIT_CARNAME);
        } while (!isValidNameLength(allCarOfRacingGame));
        return allCarOfRacingGame;
    }

    private static boolean isValidNameLength(String[] allCarOfRacingGame) {
        for (String carName : allCarOfRacingGame) {
            if (carName.length() < MINIMUM_CAR_NAME_LENGTH || carName.length() > MAXIMUM_CAR_NAME_LENGTH) {
                System.out.println(CAR_NAME_LENGTH_ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public static int inputRound() {
        int round;
        do {
            System.out.println(INPUT_ROUND_MESSAGE);
            round = sc.nextInt();
        } while (!isValidRoundNumber(round));
        return round;
    }

    private static boolean isValidRoundNumber(int round) {
        if(round<MINIMUM_ROUND_NUMBER){
            System.out.println(ROUND_NUMBER_ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
