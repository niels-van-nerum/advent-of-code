import model.Dial;
import model.DialChange;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SecretEntrance implements Challenge<Integer, Integer> {
    private static final String INPUT_FILE = "SecretEntrance.txt";

    @Override
    public Integer partOne() {
        InputStream input = getChallengeInput();
        List<DialChange> values = readFileValues(input);

        Dial dial = new Dial(false);

        values.iterator().forEachRemaining(dialChange -> {
            if (dialChange.direction() == 'L') dial.turnDialBack(dialChange.amount());
            if (dialChange.direction() == 'R') dial.turnDialForward(dialChange.amount());
        });

        return dial.getAmountOfTimesDialOnZero();
    }

    @Override
    public Integer partTwo() {
        InputStream input = getChallengeInput();
        List<DialChange> values = readFileValues(input);

        Dial dial = new Dial(true);

        values.iterator().forEachRemaining(dialChange -> {
            if (dialChange.direction() == 'L') dial.turnDialBack(dialChange.amount());
            if (dialChange.direction() == 'R') dial.turnDialForward(dialChange.amount());
        });

        return dial.getAmountOfTimesDialOnZero();
    }

    private List<DialChange> readFileValues(InputStream file) {
        var dialChanges = new LinkedList<DialChange>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                dialChanges.add(new DialChange(line));
            }
        }
        return dialChanges;
    }

    private InputStream getChallengeInput() {
        var classLoader = SecretEntrance.class.getClassLoader();
        return classLoader.getResourceAsStream(SecretEntrance.INPUT_FILE);
    }
}
