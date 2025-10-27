package racingcar;
import java.util.*;
public class RacingGame {
    private List<Car> cars;

    public RacingGame(String[] carNames) {
        this.cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName.trim()));
        }
    }
}
