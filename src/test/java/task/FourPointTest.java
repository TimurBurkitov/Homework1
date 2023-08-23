package task;

import org.testng.Assert;
public class FourPointTest {
    @org.testng.annotations.Test
    public void testDistance() {
        Point p7 = new Point(-1.5, 33.8);
        Point p8 = new Point(12.2, 1.8);
        Assert.assertEquals(p7.distance(p8), 34.80933782765768);
    }
}
