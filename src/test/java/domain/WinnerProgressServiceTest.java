package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WinnerProgressServiceTest {
    private List<Car> cars = new LinkedList<>();

    @BeforeEach
    void setUp() {
        String[] carName = {"kim", "min", "sub"};

        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carName[i]));
        }
        cars.get(0).updatePosition(4);
        cars.get(0).updatePosition(4);
    }

    @Test
    void 우승자의_포지션값_테스트() {
        int winnerPosition = WinnerProgressService.calculateWinnerPosition(cars);
        assertThat(winnerPosition).isEqualTo(1);
    }

    @Test
    void 우승자_추출_테스트() {
        String winnerName = cars.get(0).getName();
        assertThat(winnerName).isEqualTo("min");
    }
}