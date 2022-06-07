package exemptiontest;

import java_basic.exemptiontest.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testCreateWithEmptyName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Employee(""));
        assertEquals("Name can not be empty!", exception.getMessage());
    }
}