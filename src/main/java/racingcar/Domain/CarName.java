package racingcar.Domain;

import org.junit.platform.commons.util.StringUtils;

public class CarName {
    public static final String WRONG_CART_NAME_OVER = "자동차 이름은 5자 이하만 가능하다.";
    public static final String WRONG_CART_NAME_EMPTY = "자동차 이름은 공백이 아니여야 합니다.";
    public static final int NAME_OVER_LENGTH = 5;
    private final String name;

    public CarName(String name) {
        validation(name);
        this.name = name;
    }

    private void validation(String name) {
        if (name.length() > NAME_OVER_LENGTH) {
            throw new IllegalArgumentException(WRONG_CART_NAME_OVER);
        }
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(WRONG_CART_NAME_EMPTY);
        }
    }

    public String getCarName() {
        return this.name;
    }

}
