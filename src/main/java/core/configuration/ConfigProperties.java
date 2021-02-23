package core.configuration;

public class ConfigProperties {
    private static TestsConfig appConfig = new TestsConfig();

    public String Device = appConfig.getDevice();
    public String Project = appConfig.getProject();
    public String Headless = appConfig.getHeadless();

    public String Email = appConfig.getEmail();
    public String Password = appConfig.getPassword();

    public String Environment = appConfig.getEnvironment();

//##################### --- Settings Respective to Environments --- #####################

    //                      ############ --- LOCAL --- ############
    public String url = appConfig.getUrl();
    //                                 # --- DB --- #
    public String dbUrl = appConfig.getDbUrl();
    public String dbUserName = appConfig.getDbUserName();
    public String dbPassword = appConfig.getDbPassword();
}
