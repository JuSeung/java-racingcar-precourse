package racingcar.Domain;

public class Position {
    private int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getPostion() {
        return this.position;
    }

    public void canMove() {
        this.position = this.position + 1;
    }
}
