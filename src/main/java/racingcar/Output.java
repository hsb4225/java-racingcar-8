package racingcar;

import java.util.*;

public class Output {
    public static void printResult(List<Car> cars) {

        System.out.println("실행 결과");

        for (Car car : cars) {
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void printWinners(List<String> winners) {
        System.out.print("최종 우승자 : ");
        Iterator<String> iterator = winners.iterator();
        
        while (iterator.hasNext()) {
            String winner = iterator.next();
            System.out.print(winner);
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}

