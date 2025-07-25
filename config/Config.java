package querypotter.config;

public class Config {
    public static String dbName;
    private static String serverIp;
    private static String serverPort;
    private static String schema;
    private static String user;
    private static String passwd;

    public Config(String dbName, String serverIp, String serverPort,
                  String schema, String user, String passwd) {
        this.dbName = dbName;
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.schema = schema;
        this.user = user;
        this.passwd = passwd;
    }

    public static String getDbName() {return dbName;}
    public String getServerIp() {return serverIp;}
    public String getServerPort() {return serverPort;}
    public String getSchema() {return schema;}
    public String getUser() {return user;}
    public String getPasswd() {return passwd;}
}
