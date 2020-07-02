package src;

import org.junit.Test;

import java.util.Locale;

// -XX:+ShowCodeDetailsInExceptionMessages
public class NPEInfo {

    private String showUpperCase(String str){
        return str.toUpperCase(Locale.US);
    }

    @Test
    public void npe() {
        System.out.println(showUpperCase(null));
        // will now display which var is null !!

//        java.lang.NullPointerException: Cannot invoke "String.toUpperCase(java.util.Locale)" because "str" is null
//
//        at src.NPEInfo.showUpperCase(NPEInfo.java:11)

    }
}
