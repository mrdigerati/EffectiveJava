import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassBTest {


    @Test
    public void testClassA() {
        //This is where we test the ClassA

        String name = "Bob";
        ClassB b = ClassB.newInstance(name);
        //a.print();

        assertEquals(b.getName(),name);

    }

}
