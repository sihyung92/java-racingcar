package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.domain.Cars;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputViewTest {

    @DisplayName("이동 거리만큼 bar를 생성하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:-", "2:--", "3:---", "4:----"}, delimiter = ':')
    void 이동거리만큼_바를_생성하는지(int position, String bar) {
        assertThat(OutputView.makeBarByPosition(position)).isEqualTo(bar);
    }

    @DisplayName("레이싱 뷰 출력 테스트")
    @Test
    void 아웃풋_뷰_출력이_잘_되는지() {
        String[] names = {"a", "b", "c"};
        Cars cars = new Cars(Arrays.asList(names));
        OutputView.printRacing(cars);
    }

}
