package racingcar.domain;

import java.util.ArrayList;

public class Winner {
    private final Cars cars;

    public Winner(Cars cars) {
        this.cars = cars;
    }

    public String getNames() {
        ArrayList<String> names = new ArrayList<>();
        for(Car car : cars.getCars())
            names.add(car.getName());
        return String.join(", " , names);
    }
}
