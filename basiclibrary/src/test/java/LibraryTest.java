/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRoll() {
        Library classUnderTest = new Library();
        int n = 8;
        int[] resultArr = classUnderTest.roll(n);
        assertEquals(n, resultArr.length);
    }
}
