import com.sun.corba.se.impl.presentation.rmi.StubFactoryStaticImpl;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    private ClassB(String name) {
        this.name = name;
    }

    public static ClassB newInstance() {
        return new ClassB("Default");
    }

    public static ClassB newInstance(String name) {
        return new ClassB(name);
    }
}
