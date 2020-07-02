package src.preview;

import org.junit.Assert;
import org.junit.Test;

public class Records {

    private record Point(int x, int y) { };

    @Test
    public void point() {
        Point p = new Point(4, 5);
        Assert.assertEquals(4, p.x());
        Assert.assertEquals(5, p.y());

        Assert.assertEquals(4, p.x);
        Assert.assertEquals(5, p.y);
    }

    @Test
    public void person() {
        Person p = new Person("henry", "the eighth", 123);
        Assert.assertEquals(123, p.phone());
        Assert.assertEquals("henry", p.firstName());
        Assert.assertEquals("the eighth", p.lastName());
    }

    @Test
    public void toStringExample() {
        Point p = new Point(4, 5);
        Assert.assertEquals("Point[x=4, y=5]", p.toString());
    }

    @Test
    public void equalsExample() {
        Point here = new Point(1,2);
        Point samePlace = new Point(1, 2);
        Point somewhereElse = new Point(3, 4);

        Assert.assertTrue(here.equals(samePlace));
        Assert.assertFalse(here.equals(somewhereElse));
    }
}
