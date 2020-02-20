package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {

    @DisplayName("랜덤숫자 생성테스트")
    @RepeatedTest(value = 100, name = RepeatedTest.LONG_DISPLAY_NAME)
    void 랜덤숫자_생성_테스트() {
        int randInt = RandomIntGenerator.makeRandomIntZeroToNine();
        System.out.print(randInt);
        assertThat(0 <= randInt && randInt < 10).isTrue();
    }


    @DisplayName("자동차 전진 유무 확인")
    @Test
    void 자동차_전진_유무_확인() {
        Car car = new Car();
        int before = car.getPosition();
        car.move(4);
        int after = car.getPosition();
        assertThat(before + 1).isEqualTo(after);
    }

    @DisplayName("이동 거리만큼 bar를 생성하는지 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:-", "2:--", "3:---", "4:----"}, delimiter = ':')
    void 이동거리만큼_바를_생성하는지(int position, String bar) {
        RacingCarGame game = new RacingCarGame();
        assertThat(game.makeBarByPosition(position)).isEqualTo(bar);
    }

}