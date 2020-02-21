package racingcar.view;

import racingcar.domain.Cars;
import racingcar.domain.Winner;

public class OutputView {
    private static final String COLON = " : ";
    private static final String RESULT_FORMAT = "실행 결과";
    private static final String WINNER_RESULT_FORMAT = "가 최종 우승했습니다.";
    private static final String POSITION_BAR = "-";

    public static String makeBarByPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++)
            sb.append(POSITION_BAR);
        return sb.toString();
    }

    public static void printResult(Winner winner) {
        StringBuffer sb = new StringBuffer(winner.getNames());
        sb.append(WINNER_RESULT_FORMAT);
        System.out.println(sb.toString());
    }

    public static void printRacing(Cars cars) {
        cars.getCars().stream().forEach(car -> {
            System.out.println(car.getName() + COLON + makeBarByPosition(car.getPosition()));
        });
    }

    public static void printBeforeRacing() {
        System.out.println(RESULT_FORMAT);
    }

    public static void printLine() {
        System.out.println();
    }
}
