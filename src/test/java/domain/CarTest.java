package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.RandomNumberGenerator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private static final int POSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION = 4;
    private static final int WINNER_POSITION = 3;
    private static final CarMovingStrategy strategy = new CarMovingStrategyMock();

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("kim");
    }

    @Test
    void 생성자_테스트() {
        assertThat(car).isNotNull();
    }

    @Test
    void 랜덤숫자에따른_포지션_업데이트_테스트() {
        int randomNumber = RandomNumberGenerator.generateRandomNumber();

        if (randomNumber < POSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION) {
            car.updatePosition(strategy);
            assertThat(car.getPosition()).isEqualTo(0);
        }

        if (randomNumber >= POSSIBLE_FLAG_NUMBER_FOR_UPDATE_POSITION) {
            car.updatePosition(strategy);
            assertThat(car.getPosition()).isEqualTo(1);
        }
    }

    @Test
    void 우승할_포지션값을_가졌는지_테스트() {
        List<Car> cars = new LinkedList<>();
        List<String> carNames = new LinkedList<>(Arrays.asList("kim", "min", "sub"));

        for (int i = 0; i < carNames.size(); i++) {
            cars.add(new Car(carNames.get(i)));
        }

        for (int i = 0; i < WINNER_POSITION; i++) {
            cars.get(2).updatePosition(strategy);
        }

        for (Car car : cars) {
            assertThat(car.isWinner(WINNER_POSITION)).isTrue();
        }
    }
}