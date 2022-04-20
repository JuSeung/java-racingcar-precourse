package racingcar.Domain;

import org.junit.platform.commons.util.StringUtils;

public class Car {
    public static final String WRONG_CART_NAME_OVER = "자동차 이름은 5자 이하만 가능하다.";
    public static final String WRONG_CART_NAME_EMPTY = "자동차 이름은 공백이 아니여야 합니다.";
    private String name;

    public Car(String name) {
        validation(name);
        this.name = name;
    }

    private void validation(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(WRONG_CART_NAME_OVER);
        }
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(WRONG_CART_NAME_EMPTY);
        }
    }

    public String getName() {
        return this.name;
    }
}
