package src.preview;

import org.junit.Test;

public class TextBlocks {

    @Test
    public void before() {
        String json ="{\n" +
                "   \"name\":\"mkyong\",\n" +
                "   \"age\":38\n" +
                "}\n";
    }

    @Test
    public void after() {
        String json = """
               {
                   "name":"mkyong",
                   "age":38
               }
               """;
    }
}
