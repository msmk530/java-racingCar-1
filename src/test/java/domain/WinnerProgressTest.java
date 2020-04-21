package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WinnerProgressTest {

    @Test
    void calculateWinnerPosition() {
        Car[] cars = new Car[3];
        String[] carName = {"kim", "min", "sub"};

        for (int i = 0; i < 3; i++) {
            cars[i] = new Car(carName[i]);
        }

        cars[0].updatePosition(4);
        cars[0].updatePosition(4);

        int winnerPosition = WinnerProgress.calculateWinnerPosition(cars);

        assertThat(winnerPosition).isEqualTo(1);
    }
}