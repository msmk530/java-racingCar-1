package domain;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinnerCarTest {

    @Test
    void calculateWinnerPosition() {
        Car[] cars = new Car[3];
        String[] carName = {"kim","min","sub"};

        for (int i = 0; i < 3; i++) {
            cars[i] = new Car(carName[i]);
        }

        cars[0].updatePosition(4);
        cars[0].updatePosition(4);

        int winnerPosition = WinnerCar.calculateWinnerPosition(cars);

        assertThat(winnerPosition).isEqualTo(1);
    }
}