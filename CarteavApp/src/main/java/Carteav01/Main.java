package Carteav01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends seleniumBase {
    public static void main(String[] args) {
        ChromeDriver chrome = testStart("https://manager.carteav.com/login");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        CarteavLogin(chrome);
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       selectSite(chrome, "company");
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        testClose(chrome);
    }
}