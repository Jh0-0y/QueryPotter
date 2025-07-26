package querypotter;

import querypotter.config.Config;
import querypotter.config.ConfigLoader;

public class QueryPotter {

    public static void main(String[] args) {
        ConfigLoader.configLode();
        System.out.println(Config.getDbName());
    }
}
