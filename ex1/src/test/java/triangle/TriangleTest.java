package triangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lonelyinnovator
 * @date 2021/10/17
 **/

public class TriangleTest {
    Triangle T1 = new Triangle(2, 3, 4);

    @Test
    public void testlsTriangle() {
        Assert.assertEquals(true, T1.isTriangle(T1));
    }
}
