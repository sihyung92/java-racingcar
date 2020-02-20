package racingcar.domain;

public class Car {
    private static final int GO_NUMBER = 4;
    private int position;

    public int getPosition() {
        return this.position;
    }

    public void move(int random) {
        if (random >= GO_NUMBER)
            this.position++;
    }
}