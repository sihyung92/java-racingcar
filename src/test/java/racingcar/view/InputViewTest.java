package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.util.StringUtils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @DisplayName("자동차 대수 10대 이하인지 검사")
    @ParameterizedTest
    @CsvSource(value = {"a,b,c,d,e,f,g,h,i,j:true", "a,b,c,d,e,f,g,h,i,j,k:false"}, delimiter = ':')
    void 자동차_대수_검사(String input, boolean expectedResult) {
        List<String> names = StringUtils.splitByDelimiterAsList(input, ",");
        assertThat(names.size() <= 10).isEqualTo(expectedResult);
    }


}
