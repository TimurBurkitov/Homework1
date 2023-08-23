package task;

import org.testng.Assert;

public class OnePointTest {

    @org.testng.annotations.Test
    public void testDistance() {
        Point p1 = new Point(5, 8);
        Point p2 = new Point(15, 11);
        Assert.assertEquals(p1.distance(p2), 10.44030650891055);
    }
}
