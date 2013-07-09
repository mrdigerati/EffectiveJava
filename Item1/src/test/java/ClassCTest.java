import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassCTest {


    @Test
    public void testClassC() {
        //This is where we test the ClassC
        HashMap<ArrayList<String>,TreeSet<Integer>> map = ClassC.newMap();
        map.isEmpty();

    }

}
