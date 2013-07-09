package service.provider.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: nikunj
 * Date: 10/7/13
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Services {

    private Services() {

    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "DEFAULT";

    public static void registerDefaultProvider(Provider p)  {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    public static void registerProvider(String name, Provider p)  {
        providers.put(name, p);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException("No provider registered with name: " + name);
        return p.newService();
    }

}
