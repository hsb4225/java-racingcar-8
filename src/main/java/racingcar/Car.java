package racingcar;

public class Car {

    private int position = 0;
    private String carName;

    public Car(String[] names) {
        for(String name : names) {
            isValidName(name);
            this.carName = name;
        }
    }
    private void isValidName(String name) {
        if(name == null || name.length() > 5 || name.isBlank())
            throw new IllegalArgumentException("자동차 이름은 1~5자 입니다.");
    }
    public void straight(boolean straight) {
        if(straight)
            position++;
    }
    public int getPosition() {
        return position;
    }
    public String getCarName() {
        return carName;
    }
}
