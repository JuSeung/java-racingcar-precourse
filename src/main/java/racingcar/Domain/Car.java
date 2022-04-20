package racingcar.Domain;

import org.junit.platform.commons.util.StringUtils;

public class Car {

    private CarName carName;

    public Car(String name) {

        this.carName = new CarName(name);
    }

    public String getCarName() {
        return this.carName.getCarName();
    }
}
