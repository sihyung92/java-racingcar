package racingcar.view;

import racingcar.domain.Cars;
import racingcar.domain.Winner;

public class OutputView {
    private static final String COLON = " : ";
    private static final String RESULT_FORMAT = "실행 결과";

    public static String makeBarByPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++)
            sb.append('-');
        return sb.toString();
    }

    public static void printResult(Winner winner) {

    }

    public static void printRacing(Cars cars) {
        cars.getCars().stream().forEach(car -> {
            System.out.println(car.getName() + COLON + makeBarByPosition(car.getPosition()));
        });
    }

    public static void printBeforeRacing() {
        System.out.println(RESULT_FORMAT);
    }
}
