package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
//Tesztosztály
@TestMethodOrder(MethodOrderer.Random.class)
class CalculatorTest {
    // a benne levő metódusok a tesztesetek
    @Test
    void add() { //baloldalt a sorszám mellett zöld háromszög: RUN, kettős háromszög: RUN ALL CASES
        //BDD: Behaviour Driven Design
        //egy teszteset három részből áll: GIVEN, WHEN, THEN (assert)
        Calculator calculator = new Calculator(); // GIVEN
        int result = calculator.add(5,6); // WHEN
        assertEquals(11, result); //THEN
    }
    @Test
    @DisplayName("With two positive numbers")
    void test_given_two_positive_number_should_return_sum_of_them(){
        assertEquals(11, new Calculator().add(4,7));
    }
}