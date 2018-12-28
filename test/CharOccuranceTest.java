import static org.junit.Assert.*;

public class CharOccuranceTest {
    CharOccurance obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new CharOccurance();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void count_occur() {
        assertEquals("Error",2,obj.count_occur("Rohit Patil",'i',0));
        assertEquals("Error",2,obj.count_occur("Hello world",'o',0));
        assertEquals("Error",2,obj.count_occur("rolling stones",'l',0));
        assertEquals("Error",1,obj.count_occur("white iverson",'t',0));


    }
    @org.junit.Test
    public void count_occurFails()
    {
        assertNotNull("Error",obj.count_occur("keshav",'k',0));
    }
}