package Carteav01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumBase {
    public static void testClose(ChromeDriver driver) {
        System.out.println("Test End");
        driver.close();
    }
    public static void CarteavLogin(ChromeDriver driver) {
//        String url = "https://manager.carteav.com/login";
//        ChromeDriver driver = testStart(url);
//        WebDriverWait wait = new WebDriverWait(driver, 40);
//        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

//        Thread.sleep(5 * 1000);

        WebElement searchBox = driver.findElement(By.id("outlined-adornment-userName"));
        searchBox.click();
        searchBox.sendKeys("alon");
        searchBox = driver.findElement(By.id("outlined-adornment-password"));
        searchBox.click();
        searchBox.sendKeys("alon");
        // searchBox = driver.findElement(By.className("MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButtonBase-root  css-1irpu19"));
        driver.findElement(By.cssSelector("button.MuiButton-containedPrimary")).click();
        System.out.println("Login Success");
    }

    public static ChromeDriver testStart(String url) {
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
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        return driver;
    }

    public static void clickAndSend(String text, WebElement element) {
        element.click();
        element.clear();
        element.sendKeys(text);

    }

    public static void selectSite(ChromeDriver driver, String site) {
        if (site == "develop")
            driver.findElement(By.cssSelector("[style='display: flex; position: relative; top: 10px; margin-right: 10px;']")).click();
        if (site == "company")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px; border-bottom: 3px solid rgb(7, 10, 14);']")).click();
        if (site == "emulator")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "shikma")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "voyage")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "demo")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "pilot")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "disney")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "poleg")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "gani tikva")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();
        if (site == "mikve")
            driver.findElement(By.cssSelector("[style='display: inline-block; position: relative; left: 62px;']")).click();

    }

    public static void main(String[] args) throws InterruptedException {

    }
    public static void  EventHistory (ChromeDriver driver, String EventHistory) {


        }

    }

