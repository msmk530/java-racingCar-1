package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class GameProgressTest {

    @Test
    void 자동차_만들기_테스트() {
        String[] allCarOfName = {"kim  ","min  ","sub  "};
        Car[] cars = GameProgress.makeCar(allCarOfName);

        assertThat(cars[0].getName()).isEqualTo("kim");
        assertThat(cars[1].getName()).isEqualTo("min");
        assertThat(cars[2].getName()).isEqualTo("sub");

    }

    @Test
    void 라운드_진행_테스트() {


    }
}