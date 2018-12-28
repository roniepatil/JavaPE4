import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Word_sortTest {
    Word_sort obj;

    @Before
    public void setUp() throws Exception {
        obj=new Word_sort();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void word_sort() {
        assertEquals("error",
                "a b c d",obj.word_sort("d c b a") );
        assertEquals("error",
                "Patil Rohit",obj.word_sort("Rohit Patil") );
        assertEquals("error",
                "Patil Rohit",obj.word_sort("Rohit"+"\n"+"Patil") );
        assertEquals("error",
                "I and you",obj.word_sort("you and I") );

    }
}