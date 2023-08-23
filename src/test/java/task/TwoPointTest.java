package task;

import org.testng.Assert;

public class TwoPointTest {
    @org.testng.annotations.Test
    public void testDistance() {
        Point p3 = new Point(14, 2);
        Point p4 = new Point(-2, -3);
        Assert.assertEquals(p3.distance(p4), 16.76305461424021);
    }
}
