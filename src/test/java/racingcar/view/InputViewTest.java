package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.util.StringUtils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {

    @DisplayName("자동차 대수 10대 이하인지 검사")
    @ParameterizedTest
    @CsvSource(value = {"a,b,c,d,e,f,g,h,i,j:true", "a,b,c,d,e,f,g,h,i,j,k:false"}, delimiter = ':')
    void 자동차_대수_검사(String input, boolean expectedResult) {
        List<String> names = StringUtils.splitByDelimiterAsList(input, ",");
        assertThat(names.size() <= 10).isEqualTo(expectedResult);
    }

    @DisplayName("자동차 이름 검사 (공백인지)")
    @ParameterizedTest
    @NullAndEmptySource
    void 자동차_이름_검사(String input) {
        assertThatThrownBy(() -> { new InputView().validateNames(input); })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("비어있는 이름은 입력할 수 없습니다.");
    }

    @DisplayName("라운드 숫자 검사 (0이 아닌지)")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void 라운드_숫자_검사(int i) {
        assertThatThrownBy(() -> { new InputView().validateCount(i); })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 ~ 9 사이의 숫자를 입력해주세요.");
    }

}
