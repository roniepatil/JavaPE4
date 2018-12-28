import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {
    ReplaceAll obj;

    @Before
    public void setUp() throws Exception {
        obj=new ReplaceAll();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void replace() {
        assertEquals("errr","fonkey",obj.replace("donkey"));
        assertEquals("errr","tong",obj.replace("long"));
        assertEquals("errr","fan brown",obj.replace("dan brown"));
        assertEquals("errr","bye",obj.replace("bye"));
    }
    @Test
    public void replacefail() {
       assertNotNull("error",obj.replace("daily"));
    }
}