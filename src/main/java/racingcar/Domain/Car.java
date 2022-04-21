package racingcar.Domain;


public class Car {
    public static final int CAN_MOVE_NUMBER = 4;
    private final CarName carName;
    private final Position position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.carName = new CarName(name);
        this.position = new Position(position);
    }

    public void move(int randomNumber) {
        if (randomNumber >= CAN_MOVE_NUMBER) {
            position.canMove();
        }
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getPosition() {
        return position.getPostion();
    }

    public boolean isWinner(int winnerPosition) {
        return position.getPostion() == winnerPosition;
    }
}
