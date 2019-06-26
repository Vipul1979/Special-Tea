package FirstProject.BDDPractice;


import FirstProject.BDDPractice.Driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();

    @Before
    public void setUp() {
        driverFactory.openBrowser();
        driverFactory.maxiBroser();
        driverFactory.applyImpWait();
    }

    @After
    public void tearDown() {
        driverFactory.closeBrowser();

    }
}
