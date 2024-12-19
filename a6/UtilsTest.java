package com.example.a6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class UtilsTest {
    @Test
    public void testGetCharCountMessage() {
        assertEquals("Total characters: 5", Utils.getCharCountMessage(5));
        assertEquals("Total characters: 11", Utils.getCharCountMessage(11));
        assertEquals("Total characters: 23", Utils.getCharCountMessage(23));
    }
}
