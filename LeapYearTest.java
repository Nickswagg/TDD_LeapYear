import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test (expected = RuntimeException.class)
    public final void whenEnteredLettersThrowAnException(){
        LeapYear.checkYear("2oo1");
    }
    
    @Test (expected = RuntimeException.class)
    public final void whenEnteredNegativeNumberThrowAnException(){
        LeapYear.checkYear("-2000");
    }

    @Test
    public final void whenYearIsDivisibleBy4ReturnTrue(){
        assertEquals(true, LeapYear.checkYear("2004"));
    }

    @Test
    public final void whenYearIsDivisibleBy4WhileNotDivisibleBy100UnlessDivisibleBy400(){
        assertEquals(false, LeapYear.checkYear("1900"));
    } 
}
