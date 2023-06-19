package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project4Page {

    public Project4Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "is-size-2")
    public WebElement inventoryHeading;

    @FindBy(css = "tr[class='DynamicTables_tableHeaders__5cFWb'] th")
    public List<WebElement> dynamicTableAllHeaders;

    @FindBy(css = "tbody tr td")
    public List<WebElement> tableRows;

    @FindBy(id = "add_product_btn")
    public WebElement addProductButton;

    @FindBy(id = "total_amount")
    public  WebElement totalPriceAmount;

    @FindBy(id = "modal_title")
    public  WebElement addNewProductModalTitleHeadiing;

    @FindBy(css = "label[for='product_quantity']")
    public  WebElement quantityInputLabel;

    @FindBy(id = "quantity")
    public  WebElement quantityInput;

    @FindBy(css = "label[for='product_name']")
    public  WebElement nameOfProductInputLabel;

    @FindBy(id = "product")
    public  WebElement nameOfProductInput;

    @FindBy(css = "label[for='product_price']")
    public  WebElement priceOfProductInputLabel;

    @FindBy(id = "price")
    public  WebElement priceOfProductInput;

    @FindBy(className = "delete")
    public  WebElement xButton;

    @FindBy(id = "submit")
    public  WebElement submitButton;


}
