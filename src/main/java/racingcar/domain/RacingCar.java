package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCar {
    private Cars cars;

    public void run() {
        List<String> names = InputView.inputNames();
        int count = InputView.inputCount();
        cars = makeCars(names);
        OutputView.printBeforeRacing();
        repeatedRacingByCount(count);
        OutputView.printResult(findWinner());
    }

    public Cars makeCars(List<String> names){
        return new Cars(names);
    }

    private void repeatedRacingByCount (int count){
        for(int i=0; i < count; i++){
            cars.move();
            OutputView.printRacing(cars);
            OutputView.printLine();
        }
    }

    private Winner findWinner() {
        return cars.findWinner();
    }
}
