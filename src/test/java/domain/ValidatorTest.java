package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    @Test
    void 문자열_길이_테스트() {
        String[] testNames = {"kim", "min", "subbbb"};
        assertThat(Validator.isValidNameLength(testNames)).isTrue();
    }

    @Test
    void 라운드_숫자_테스트() {
        assertThat(Validator.isValidRoundNumber(-1)).isTrue();
    }

    @Test
    void 중복_이름_테스트() {
        String[] testNames = {"kim", "min", "sub", "sub"};
        assertThat(Validator.isDuplicatedName(testNames)).isTrue();
    }
}