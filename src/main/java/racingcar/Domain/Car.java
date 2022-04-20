package racingcar.Domain;


public class Car {
    private CarName carName;
    private Position position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.carName = new CarName(name);
        this.position = new Position(position);
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            position.canMove();
        }
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getPosition() {
        return position.getPostion();
    }
}
