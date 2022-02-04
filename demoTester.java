import static org.junit.Assert.*;
import org.junit.*;

public class demoTester {
    private Demo demo1;
    @Test
    public void multiply1() {
        demo1 = new Demo();
        assertEquals(5, demo1.multiply(1,5));
    }
}