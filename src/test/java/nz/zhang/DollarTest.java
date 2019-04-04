package nz.zhang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testDollarDivision() {
        // Given
        Dollar ten = new Dollar(10);
        // When
        Dollar result = ten.dividedBy(2);
        // Then
        assertEquals(new Dollar(5), result); // You could change 5 to 4 to see the build failure
    }
    @Test
    public void testDollarDividedByZero() {
        // Given
        Dollar ten = new Dollar(10);
        // When
        assertThrows(ArithmeticException.class, () -> ten.dividedBy(0));
    }
}