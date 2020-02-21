package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class WinnerTest {

    @DisplayName("우승자 이름 출력 test")
    @Test
    void 우승자_출력_테스트() {
        String[] names = {"a","b","c"};
        Winner winner = new Winner(new Cars(Arrays.asList(names)));
        assertThat(winner.getNames()).isEqualTo("a, b, c");
    }
}
