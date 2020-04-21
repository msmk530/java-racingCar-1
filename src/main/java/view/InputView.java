package view;

import domain.Validator;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력해주세요";
    private static final String FOR_SPLIT_CARNAME = ",";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";
    private static Scanner sc = new Scanner(System.in);

    public static String[] inputCarsName() {
        String carsName;
        String[] allCarOfRacingGame;
        do {
            System.out.println(INPUT_CARS_NAME_MESSAGE);
            carsName = sc.nextLine();
            allCarOfRacingGame = carsName.split(FOR_SPLIT_CARNAME);
        } while (!Validator.isValidNameLength(allCarOfRacingGame));
        return allCarOfRacingGame;
    }

    public static int inputRound() {
        int round;
        do {
            System.out.println(INPUT_ROUND_MESSAGE);
            round = sc.nextInt();
        } while (!Validator.isValidRoundNumber(round));
        return round;
}
}
