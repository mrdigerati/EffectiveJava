package service.provider.framework;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProviderImpl2 implements Provider {

    String name = "CatService";

    public void print()  {
        System.out.print(name);
    }

    public Service newService() {
        return new CatService();
    }

}
