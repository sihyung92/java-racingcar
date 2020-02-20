package racingcar.domain;

import java.util.Collections;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public int findMaxPosition() {
        int max = 0;
        for (Car car : cars)
            if (max < car.getPosition())
                max = car.getPosition();
        return max;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
