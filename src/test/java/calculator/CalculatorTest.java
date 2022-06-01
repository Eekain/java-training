package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//Tesztosztály
@TestMethodOrder(MethodOrderer.Random.class)
class CalculatorTest {
    // a benne levő metódusok a tesztesetek

    private Calculator calculator;

    @BeforeEach
    void init(){
        System.out.println("init");
        calculator = new Calculator();
    }
    @Test
    void add() { //baloldalt a sorszám mellett zöld háromszög: RUN, kettős háromszög: RUN ALL CASES
        //BDD: Behaviour Driven Design
        //egy teszteset három részből áll: GIVEN, WHEN, THEN (assert)
       // Calculator calculator = new Calculator(); // GIVEN
        int result = calculator.add(5,6); // WHEN
        assertEquals(11, result); //THEN
    }
    @Test
    @DisplayName("With two positive numbers")
    void test_given_two_positive_number_should_return_sum_of_them(){
        assertEquals(11, calculator.add(4,7));
    }

    @Test
    void testMultiply(){
        assertEquals(0.3, calculator.multiply(0.1, 3), 0.005);
    }
}