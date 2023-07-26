package Carteav01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarteavLogin extends seleniumBase {
    public static void main(String[] args) {
        String url = "https://manager.carteav.com/login";
        ChromeDriver driver = testStart(url);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement searchBox = driver.findElement(By.id("outlined-adornment-userName"));
        searchBox.click();
        searchBox.sendKeys("alon");
        searchBox = driver.findElement(By.id("outlined-adornment-password"));
        searchBox.click();
        searchBox.sendKeys("alon");
        // searchBox = driver.findElement(By.className("MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButtonBase-root  css-1irpu19"));
        driver.findElement(By.cssSelector("button.MuiButton-containedPrimary")).click();
        System.out.println("Login Success");

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        testClose(driver);

    }
}
