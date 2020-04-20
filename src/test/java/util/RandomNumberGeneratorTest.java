package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    @Test
    void generateRandomNumber() {
        assertThat(RandomNumberGenerator.generateRandomNumber()).isLessThan(10);
    }
}