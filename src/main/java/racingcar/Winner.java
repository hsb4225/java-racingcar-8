package racingcar;

import java.util.*;

public class Winner {
    public List<String> findWinners(List<Car> cars) {
        List<String> winners = new ArrayList<>();
        int maxPosition = -1;

        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getCarName());
            }
        }

        return winners;
    }
}

