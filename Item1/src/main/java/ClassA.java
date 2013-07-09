/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassA {
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

    public ClassA(String name) {
        this.name = name;
    }
}
