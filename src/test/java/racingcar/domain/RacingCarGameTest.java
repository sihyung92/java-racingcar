package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {

    @DisplayName("RacingCar.go() : 알맞은 숫자가 들어왔을 경우")
    @ParameterizedTest
    @CsvSource(value = {"0:false", "1:false", "2:false", "3:false", "4:true", "5:true", "6:true", "7:true", "8:true", "9:true"}, delimiter = ':')
    void goTest(int input, boolean expectedResult) {
        assertThat(RacingCarGame.go(input)).isEqualTo(expectedResult);
    }


    @DisplayName("랜덤숫자 생성테스트")
    @RepeatedTest(value = 100, name = RepeatedTest.LONG_DISPLAY_NAME)
    void 랜덤숫자_생성_테스트() {
        int randInt = RandomIntGenerator.makeRandomIntZeroToNine();
        System.out.print(randInt);
        assertThat(0 <= randInt && randInt < 10).isTrue();
    }
}