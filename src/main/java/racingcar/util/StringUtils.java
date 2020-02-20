package racingcar.util;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
    static List<String> list;

    public static List<String> splitByDelimiterAsList(String target, String delimiter) {
        return list = Arrays.asList(target.split(delimiter));
    }
}
