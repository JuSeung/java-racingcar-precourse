package racingcar.Domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차는 이름을가진다.")
    @Test
    void set_car_name() {
        Car car = new Car("jsshin");
        assertThat(car.getName()).isEqualTo("jsshin");
    }

}
