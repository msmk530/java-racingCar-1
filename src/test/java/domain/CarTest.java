package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("sub");
    }

    @Test
    void 생성자_테스트() {
        List<Car> testCar = new LinkedList<>();
        testCar.add(new Car("min"));
        testCar.add(new Car("kim"));

        assertThat(testCar).extracting("name").contains("kim");
        assertThat(testCar).extracting("name").contains("sub");
    }

    @Test
    void 랜덤숫자에따른_이동여부_테스트() {
        assertThat(car.isCarMove(3)).isTrue();
    }

    @Test
    void 랜덤숫자에따른_포지션_업데이트_테스트() {
        Car positionTestCar = new Car("min");
        positionTestCar.updatePosition(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}