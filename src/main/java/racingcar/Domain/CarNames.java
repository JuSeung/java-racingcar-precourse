package racingcar.Domain;

import java.util.Arrays;
import java.util.List;
import org.junit.platform.commons.util.StringUtils;

public class CarNames {
    public static final String WRONG_CART_NAME_EMPTY = "자동차 이름은 공백이 아니여야 합니다.";
    public static final String SEPARATION = ",";
    private final List<String> carNameList;

    public CarNames(String inputCarNames) {
        validationEmpty(inputCarNames);
        this.carNameList = conversionToList(inputCarNames);
    }

    private List<String> conversionToList(String inputCarNames) {
        return Arrays.asList(inputCarNames.split(SEPARATION));
    }

    private void validationEmpty(String inputCarNames) {
        if (StringUtils.isBlank(inputCarNames)) {
            throw new IllegalArgumentException(WRONG_CART_NAME_EMPTY);
        }
    }

    public List<String> getCarNameList() {
        return carNameList;
    }
}
