package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private static final int IMPOSSIBLE_NUMBER_FOR_UPDATE_POSITION = 3;
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("sub");
    }

    @Test
    void 생성자_테스트() {
        List<Car> testCars = new LinkedList<>();
        testCars.add(new Car("min"));
        testCars.add(new Car("kim"));

        assertThat(testCars).extracting("name").contains("kim");
        assertThat(testCars).extracting("name").contains("sub");
    }

    @Test
    void 랜덤숫자에따른_포지션_업데이트_테스트() {
        car.updatePosition(IMPOSSIBLE_NUMBER_FOR_UPDATE_POSITION);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}