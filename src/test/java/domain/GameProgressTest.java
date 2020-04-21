package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameProgressTest {
    private Car[] cars;

    @BeforeEach
    void setUp() {
        String[] allCarOfName = {"kim  ", "min  ", "sub  "};
        cars = GameProgress.makeCar(allCarOfName);
    }

    @Test
    void 자동차_만들기_테스트() {
        assertThat(cars[0].getName()).isEqualTo("kim");
        assertThat(cars[1].getName()).isEqualTo("min");
        assertThat(cars[2].getName()).isEqualTo("sub");
    }

    @Test
    void 라운드_진행_테스트() {
        boolean updateFlag = false;

        for (Car car : cars) {
            assertThat(car.getPosition()).isEqualTo(0);
        }

        GameProgress.progressRound(cars);

        for (Car car : cars) {
            if (car.getPosition() != 0) {
                updateFlag = true;
                break;
            }
        }

        assertThat(updateFlag).isEqualTo(true);
    }
}