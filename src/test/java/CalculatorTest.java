import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Run once before all tests......");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Run once after all tests.......");
    }

    @BeforeEach
    void setUp(){
        calc = new Calculator();
        System.out.println("SetUp before each test......");
    }

    @AfterEach
    void tearDown(){
        calc = null;
        System.out.println("CleanUp after each test......");
    }
    @Test
    void testAdd(){
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract(){
        assertEquals(9, calc.subtract(16, 7));
    }

    @Test
    void testMultiply(){
        assertEquals(21, calc.multiply(7, 3));
    }

    @Test
    void testDivide(){
        assertEquals(5, calc.divide(20, 4));
    }

    @Test
    void testDivideByZero(){
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Disabled("Feature not implemented yet")
    @Test
    void skippedTest(){
        fail("This test is skipped");
    }
}
