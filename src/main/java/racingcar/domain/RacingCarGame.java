package racingcar.domain;

public class RacingCarGame {
    private int maxPosition;
    Cars cars;
    Winner winner;

    public String makeBarByPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append('-');
        }
        return sb.toString();
    }

    private void getMaxPosition(Cars cars) {
        this.maxPosition = cars.findMaxPosition();
    }

    private void getWinner() {
        winner = new Winner(cars);
    }
}
