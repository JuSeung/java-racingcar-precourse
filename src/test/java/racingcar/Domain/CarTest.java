package racingcar.Domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차는 이름을가진다.")
    @Test
    void set_car_name() {
        Car car = new Car("shin");
        assertThat(car.getCarName()).isEqualTo("shin");
    }

    @DisplayName("자동차 이름은 5자이상이면 IllegalArgumentException 던진다.")
    @Test
    void car_name_lengh() {
        assertThatThrownBy(() -> {
            Car car = new Car("jsshin11111");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자 이하만 가능하다.");
    }


    @DisplayName("자동차 이름은 공백이면 IllegalArgumentException 던진다.")
    @Test
    void car_name_empty() {
        assertThatThrownBy(() -> {
            Car car = new Car("");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 공백이 아니여야 합니다.");
    }


}
