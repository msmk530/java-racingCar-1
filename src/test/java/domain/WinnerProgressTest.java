package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WinnerProgressTest {
    private Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[3];
        String[] carName = {"kim", "min", "sub"};

        for (int i = 0; i < 3; i++) {
            cars[i] = new Car(carName[i]);
        }

        cars[0].updatePosition(4);
        cars[0].updatePosition(4);
    }

    @Test
    void 우승자의_포지션값_테스트() {
        int winnerPosition = WinnerProgress.calculateWinnerPosition(cars);
        assertThat(winnerPosition).isEqualTo(1);
    }

    @Test
    void 우승자_추출_테스트() {
        String winnerName = cars[0].getName();
        assertThat(winnerName).isEqualTo("min");
    }
}