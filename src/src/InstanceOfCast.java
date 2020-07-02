package src;

import org.junit.Test;

public class InstanceOfCast {

    @Test
    public void instanceofCast() {
        String obj = "hiya";

        if (obj instanceof String s) {      // instanceof, cast and bind variable in one line.
            if("hiya".equalsIgnoreCase(s)){
                System.out.println("This worked!");
            }
        } else {
            System.out.println("not a string");
        }
    }
}
