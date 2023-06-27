package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.Project4Page;
import pages.Project5Page;
import utils.Driver;

public class Project5Steps {

    WebDriver driver;
    Project5Page project5Page;

    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        project5Page = new Project5Page();
    }



}
