import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Each challenge in the Advent of Code contains two parts, thus we create an interface for it.
 * Two parts of each challenge may return different types, so generic types are used.
 */
public interface Challenge<T, U> {
    Logger LOGGER = LogManager.getLogger(Challenge.class);

    T partOne();
    U partTwo();

    default void main() {
        LOGGER.info("Starting challenge!");
        LOGGER.info("Result part one: {}", partOne());
        LOGGER.info("Result part two: {}", partTwo());
    }
}