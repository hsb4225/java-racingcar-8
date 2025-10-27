package racingcar;
import java.util.*;
public class RacingGame {
    private List<Car> cars;
    private static int STRAIGHT_DETECTION_NUMBER = 4;

    public RacingGame(String[] carNames) {
        this.cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName.trim()));
        }
    }

    public void straightCar() {
        for(Car car : cars) {
            RandomNumber randomNumber = new RandomNumber();
            randomNumber.randomNumberGenerate();
            int ranNumber = randomNumber.getNumber();

            car.straight(ranNumber >= STRAIGHT_DETECTION_NUMBER);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
