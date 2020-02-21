package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public Winner findWinner() {
        int maxPosition = findMaxPosition();
        for (int i = 0; i < cars.size(); i++) {
            if (!cars.get(i).isMaxPosition(maxPosition)){
                cars.remove(i);
                i--;
            }
        }
        return new Winner(this);
    }

    private int findMaxPosition() {
        int max = 0;
        for (Car car : cars)
            if (max < car.getPosition())
                max = car.getPosition();
        return max;
    }

    public void move() {
        for (Car car : cars)
            car.move(RandomIntGenerator.makeRandomIntZeroToNine());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
