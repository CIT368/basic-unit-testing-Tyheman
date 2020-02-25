//Author: Tyler Mankey
//Purpose: Develop Test Cases for Telephone Class

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class TelephoneTest {

    //All of the following tests can be used for the unformat method in the Telephone class

    String number = "(570)345-1343";
    @Test
    public void isNumberEmpty() {
        assertFalse(number.isEmpty(), () -> "Aborting test: Number is empty");
    }

    @Test
    public void isNumberFormatted() {
        assumeTrue(Telephone.isFormatted(number));
    }

    @Test
    public void containsNoExtraCharacters() {
        assertEquals(13, number.length());
    }
}
