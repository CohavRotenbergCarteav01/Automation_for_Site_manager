package PageObjectExample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private WebDriver driver;
    @FindBy(id="result-stats")
    WebElement results ;
    public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getResult (){
    String text = results.getText();
    return text ;
    }
}
