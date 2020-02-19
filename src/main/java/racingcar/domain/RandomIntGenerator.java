package racingcar.domain;

import java.util.Random;

public class RandomIntGenerator {

    public static int makeRandomIntZeroToNine() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
