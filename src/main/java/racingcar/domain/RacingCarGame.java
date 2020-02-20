package racingcar.domain;

public class RacingCarGame {

    public String makeBarByPosition(int position){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < position; i++) {
            sb.append('-');
        }
        return sb.toString();
    }
}
