package service.provider.framework;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProviderImpl implements Provider {
    String name = "DogService";

    public void print() {
        System.out.print(name);
    }


    public Service newService() {
        return new DogService();
    }

}
