package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String[] inputCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");
        if(names.length == 0) {
            throw new IllegalArgumentException("자동차 이름을 하나 이상 입력해야 합니다.");
        }
        return names;
    }

    public static int inputCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            int count = Integer.parseInt(Console.readLine());

            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
            return count;

        } catch (Exception e) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }
}
