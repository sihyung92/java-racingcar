package racingcar.domain;

public class Car {
    private static final int GO_NUMBER = 4;
    private static final int POSITION_INIT_NUMBER = 1;
    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        position = POSITION_INIT_NUMBER;
    }

    public boolean isMaxPosition(int maxPosition) {
        if (position == maxPosition) {
            return true;
        }
        return false;
    }

    public void move(int random) {
        if (random >= GO_NUMBER)
            this.position++;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return position;
    }
}