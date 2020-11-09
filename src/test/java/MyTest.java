import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyTest {

    @Test
    public void test(){
       assertEquals(5,5);
    }

    @Test
    public void testFail(){
        assertEquals(2,2);
    }
}
