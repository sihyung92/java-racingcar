package racingcar.view;

import racingcar.util.StringUtils;

import java.util.List;
import java.util.Scanner;


public class InputView {
    private final static Scanner scanner = new Scanner(System.in);

    private static final String INTRODUCE_INPUT_PLAYERS_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String QUESTION_INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String ERROR_INPUT_COUNT_MESSAGE = "%d 보다 크고 %d 보다 작은 숫자를 입력해주세요.";
    private static final String ERROR_INPUT_NAMES_MESSAGE = "비어있는 이름은 입력할 수 없습니다.";
    private static final String INPUT_PLAYERS_DELIMITER = ",";
    private static final int ZERO = 0;
    private static final int BOUND = 10;

    public static List<String> inputNames() {
        System.out.println(INTRODUCE_INPUT_PLAYERS_MESSAGE);
        return StringUtils.splitByDelimiterAsList
                (validateNames(scanner.nextLine()), INPUT_PLAYERS_DELIMITER);
    }

    public static int inputCount() {
        System.out.println(QUESTION_INPUT_COUNT_MESSAGE);
        int count = scanner.nextInt();
        return validateCount(count);
    }

    public static int validateCount(int count) {
        if (isEmptyCount(count))
            throw new IllegalArgumentException(String.format(ERROR_INPUT_COUNT_MESSAGE, ZERO, BOUND));
        return count;
    }

    public static String validateNames(String input) {
        if (isEmptyName(input))
            throw new IllegalArgumentException(ERROR_INPUT_NAMES_MESSAGE);
        return input;
    }

    private static boolean isEmptyCount(int count) {
        return (count <= ZERO || count >= BOUND);
    }

    private static boolean isEmptyName(String input) {
        return (input == null || input.trim().equals(""));
    }
}
