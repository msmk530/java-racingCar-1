package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 랜덤숫자에_따른_차의_이동(){
        Car car = new Car("sub");
        assertThat(car.isCarMove(3)).isTrue();
    }
}