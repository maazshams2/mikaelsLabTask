package core.configuration;

import core.configuration.testProperties.PropertiesLoader;
import core.configuration.testProperties.Property;
import core.configuration.testProperties.PropertyFile;

@PropertyFile("config.properties")
public class TestsConfig {

    private static TestsConfig config;

    public static TestsConfig getConfig() {
        if (config == null) {
            config = new TestsConfig();
        }
        return config;
    }

    TestsConfig() {
        PropertiesLoader.populate(this);
    }

    @Property("Device")
    private String Device ="";
    @Property("Project")
    private String Project ="";
    @Property("Headless")
    private String Headless ="";

    @Property("email")
    private String email = "";
    @Property("password")
    private String password = "";

    @Property("environment")
    private String environment = "";

    //##################### --- Settings Respective to Environments --- #####################
    //                      ############ --- PERF --- ############
    @Property("url")
    private String url = "";

    //                                 # --- DB --- #
    @Property("dbUrl")
    private String dbUrl = "";
    @Property("dbUserName")
    private String dbUserName = "";
    @Property("dbPassword")
    private String dbPassword = "";



    public String getDevice() {return Device;}
    public String getProject() {return Project;}
    public String getHeadless() {return Headless;}

    public String getEmail() {return email;}
    public String getPassword() {return password;}

    public String getEnvironment() {return environment;}

//##################### --- Settings Respective to Environments --- #####################
//                      ############ --- PERF --- ############

    public String getUrl() {
        return url;
    }

    //                                 # --- DB --- #
    public String getDbUrl() { return dbUrl; }
    public String getDbUserName() { return dbUserName; }
    public String getDbPassword() { return dbPassword; }
}

