import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    @DisplayName("Check even number")
    void testEvenNumber(int number){
        assertTrue(number % 2 == 0);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "4, 5, 9",
            "10, 15, 25"
    })
    @DisplayName("Parametrized addition test")
    void testAddition(int a, int b, int expected){
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(a, b));
    }

    @RepeatedTest(3)
    @DisplayName("Repeat random test")
    void repeatedTestExample(){
        int num = (int) (Math.random() * 10);
        assertTrue(num >= 0 && num < 10);
    }

    @Test
    @Tag("unit")
    void unitTaggedTest(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @Tag("integration")
    void integrationTaggedTest(){
        assertTrue("hello".startsWith("h"));
    }
}
