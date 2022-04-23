package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Domain.CarNames;
import racingcar.Domain.Laps;

public class InputView {
    public static final String INPUT_NAMES_MESSAGE = "경주할자동차이름(이름은쉼표(,)기준으로구분)";
    public static final String INPUT_LAPS_MESSAGE = "시도할회수";
    public static final String ERROR = "[ERROR]";

    public static CarNames askRacingCarName() {
        System.out.println(INPUT_NAMES_MESSAGE);
        while (true) {
            try {
                return new CarNames(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(ERROR + e.getMessage());
                return new CarNames(Console.readLine());
            }
        }
    }

    public static Laps askLapsNumber() {
        System.out.println(INPUT_LAPS_MESSAGE);
        while (true) {
            try {
                return new Laps(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(ERROR + e.getMessage());
                return new Laps(Console.readLine());
            }
        }
    }
}
