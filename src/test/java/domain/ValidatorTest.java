package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    @Test
    void isValidNameLength() {
        String[] testNames = {"kim","min","subbbb"};
        assertThat(Validator.isValidNameLength(testNames)).isTrue();
    }

    @Test
    void isValidRoundNumber() {
        assertThat(Validator.isValidRoundNumber(-1)).isTrue();
    }

    @Test
    void isCarMove() {
        assertThat(Validator.isCarMove(2)).isTrue();
        assertThat(Validator.isCarMove(4)).isTrue();
    }
}