package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Project5Page {

    public Project5Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "mb-5")
    public WebElement paginationHeading;


    @FindBy(id = "sub_heading")
    public WebElement subHeading;

    @FindBy(id = "content")
    public WebElement content;

    @FindBy(className = "city_info")
    public WebElement cityInfo;

    @FindBy(className = "country_info")
    public WebElement countryInfo;

    @FindBy(className = "population_info")
    public WebElement populationInfo;

    @FindBy(css = "button[id='next']")
    public WebElement nextButton;

    @FindBy(css = "button[id='previous']")
    public WebElement previousButton;

}
