package Carteav01;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;


public class MySiteManagerTest extends seleniumBase {
        public static void main(String[] args){
            String url = "https://manager.carteav.com/dashboard_site";
           ChromeDriver driver = testStart(url);

            Select compound = new Select(driver.findElementByClassName(".appBar_side_bar_open_button__3xXo0"));
           compound.selectByIndex(1);
            testClose(driver);
            System.out.println("Test end");

        }



}
