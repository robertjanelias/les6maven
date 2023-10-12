import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Should add up numbers")
    void shouldAddUpNumbers() {
        // arrange
        int x = 100;
        int y = 250;

        // act
        int result = calculator.sum(x, y);

        // assert
        assertEquals(x + y, result);
    }

    @Test
    void shouldMultiplyNumbers() {
        // arrange
        int x = 10;
        int y = 25;

        // act
        int result = calculator.times(x, y);

        // assert
        assertEquals(x * y, result);
    }
}