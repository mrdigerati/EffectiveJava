import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 1:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassC <K,V> extends HashMap<K,V> {

    public static <K,V> HashMap<K,V> newMap() {
        return new ClassC<K, V>();
    }


}
