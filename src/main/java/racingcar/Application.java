package racingcar;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String[] carNames = Input.inputCar();
        int count = Input.inputCount();

        RacingGame racingGame = new RacingGame(carNames);
        for (int i = 0; i < count; i++) {
            racingGame.straightCar();
            Output.printResult(racingGame.getCars());
        }
        List<String> winners = Winner.findWinners(racingGame.getCars());
        Output.printWinners(winners);
    }
}
