package racingcar.domain;

public class Car {
    private static final int GO_NUMBER = 4;
    private int position;
    private String name;

    public Car() {

    }

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int random) {
        if (random >= GO_NUMBER)
            this.position++;
    }

    public String getName() {
        return this.name;
    }
}