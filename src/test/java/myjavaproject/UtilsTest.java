// test/java/myjavaproject/UtilsTest.java

package myjavaproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    // Test reverseString function
    @Test
    void testReverseString() {
        assertEquals("olleh", Utils.reverseString("hello"));
        assertEquals("dlrow", Utils.reverseString("world"));
    }

    // Test capitalizeFirstLetter function
    @Test
    void testCapitalizeFirstLetter() {
        assertEquals("Hello", Utils.capitalizeFirstLetter("hello"));
        assertEquals("World", Utils.capitalizeFirstLetter("world"));
    }
}
