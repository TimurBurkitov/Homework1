package task;

import org.testng.Assert;

public class ThreePointTest {
    @org.testng.annotations.Test
    public void testDistance() {
        Point p5 = new Point(1, 25);
        Point p6 = new Point(6, 1);
        Assert.assertEquals(p5.distance(p6), 24.515301344262525);
    }
}
