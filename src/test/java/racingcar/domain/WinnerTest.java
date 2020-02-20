package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class WinnerTest {

    @DisplayName("우승자 이름 출력 test")
    @Test
    void 우승자_출력_테스트() {
        Car car1 = new Car("a");
        Car car2 = new Car("b");
        Car car3 = new Car("c");
        Winner winner = new Winner(new Cars(Arrays.asList(car1, car2, car3)));
        assertThat(winner.getNames()).isEqualTo("a, b, c");
    }
}
