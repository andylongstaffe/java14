package src;

import org.junit.Assert;
import org.junit.Test;

public class NewSwitchExpression {

    @Test
    public void oldWay() {
        int number = 1;
        String result = "";
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
                break;
        };
        Assert.assertEquals("one or two", result);
    }

    @Test
    public void yieldNotBreak() {
        int number = 1;

        String result = switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };

        Assert.assertEquals("one or two", result);
    }

    @Test
    public void switchUsingNewShortHand() {
        int number = 3;
        String result = switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
        Assert.assertEquals("three", result);
    }
}
