package PageObjectExample.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    private WebDriver driver;
    @FindBy(name="q")
    WebElement search;
    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void searchForText(String text){
        System.out.println("Try to click search on google");
        search.click();
        search.clear();
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);



    }


}
