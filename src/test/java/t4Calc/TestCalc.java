package tutorial4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc
{
    @Test
    public void TestAdd()
    {
        Calc t1 = new Calc();
        assertTrue( t1.add(3,4) == 7 );
    }
}
