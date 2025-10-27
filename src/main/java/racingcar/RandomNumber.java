package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    private int number;
    public void randomNumberGenerate() {
        this.number = Randoms.pickNumberInRange(0, 9);
    }
    public int getNumber() {
        return number;
    }
}
