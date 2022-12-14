package task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RPN_calculatorTest {

    @org.junit.jupiter.api.Test
    void compute() {
        RPN_calculator calculator = new RPN_calculator();
        RPN_calculator.compute("2 3 +");
        assertEquals(5, RPN_calculator.compute("2 3 +"));

        assertEquals(9, RPN_calculator.compute("3 6 +"));

        assertEquals(26, RPN_calculator.compute("2 3 * 4 5 * +"));

        assertEquals(-62, RPN_calculator.compute("2 3 4 5 6 * + - *"));

    }
}