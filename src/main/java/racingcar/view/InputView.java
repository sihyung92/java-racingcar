package racingcar.view;

import racingcar.util.StringUtils;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private final static Scanner scanner = new Scanner(System.in);

    private static final String INTRODUCE_INPUT_PLAYERS_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String QUESTION_INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String INPUT_PLAYERS_DELIMITER = ",";

    private List<String> names;

    public List<String> inputNames() {
        System.out.println(INTRODUCE_INPUT_PLAYERS_MESSAGE);
        return StringUtils.splitByDelimiterAsList(scanner.nextLine(), INPUT_PLAYERS_DELIMITER);
    }

    public int inputCount() {
        System.out.println(QUESTION_INPUT_COUNT_MESSAGE);
        return scanner.nextInt();
    }


}
