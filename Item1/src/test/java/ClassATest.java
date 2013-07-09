import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassATest {


    @Test
    public void testClassA() {
        //This is where we test the ClassA

        String name = "Bob";
        ClassA a = new ClassA(name);
        //a.print();

        assertEquals(a.getName(),name);

    }

}
