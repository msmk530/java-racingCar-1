package view;

import java.util.Scanner;

public class InputView {
    public static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력해주세요";
    public static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 1글자 이상 5글자 이하여야 합니다.";
    public static final String FOR_SPLIT_CARNAME = ",";
    public static final int MINIMUN_CAR_NAME_LENGTH = 1;
    public static final int MAXIMUM_CAR_NAME_LENGTH = 5;
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
            if (carName.length() < MINIMUN_CAR_NAME_LENGTH || carName.length() > MAXIMUM_CAR_NAME_LENGTH) {
                System.out.println(CAR_NAME_LENGTH_ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

}
