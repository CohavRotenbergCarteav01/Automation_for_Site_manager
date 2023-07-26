package PageObjectExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumBase {
    public static void testClose(ChromeDriver driver) {

        System.out.println("Test End");
        driver.close();


    }


    public static ChromeDriver testStart (String url) {
              String urlTemp = "https://manager.carteav.com/login/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        //       driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

        driver.get(url);
        return driver;
    }

    public static void clickAndSend(String text , WebElement element){
        element.click();
        element.clear();
        element.sendKeys(text);

    }
}