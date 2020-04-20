package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 랜덤숫자에따른_이동여부_테스트(){
        Car car = new Car("sub");
        assertThat(car.isCarMove(3)).isTrue();
    }

    @Test
    void 랜덤숫자에따른_포지션_업데이트_테스트() {
        Car car = new Car("sub");
        car.updatePosition(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

}