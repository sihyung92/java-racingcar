package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

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
        Car car = new Car("name");
        int before = car.getPosition();
        car.move(4);
        int after = car.getPosition();
        assertThat(before + 1).isEqualTo(after);
    }

}