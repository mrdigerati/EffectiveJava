package service.provider.framework;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestTest {

    @Test
    public void serviceProviderTest() {


        Provider dog = new ProviderImpl();
        Provider cat = new ProviderImpl2();

        Services.registerDefaultProvider(dog);
        Services.registerProvider("dog", dog);
        Services.registerProvider("cat", cat);


        Services.newInstance().talk();
        Services.newInstance("cat").talk();



    }

}
