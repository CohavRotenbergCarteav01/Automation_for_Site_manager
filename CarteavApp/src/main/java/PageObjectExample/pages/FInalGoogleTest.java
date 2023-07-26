package PageObjectExample.pages;

import Carteav01.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FInalGoogleTest extends seleniumBase {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.google.com";
        ChromeDriver driver = testStart(url);
        sleep(3 * 1000);
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        GoogleResultPage resultPage = new GoogleResultPage(driver);

        mainPage.searchForText("Haifa");
        String text = resultPage.getResult();
        System.out.println("Results found , the value is " + text );

        testClose(driver);
    }
}
