package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class case2 {
    private static WebDriver driver;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

    @Test
    public void test2() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("[jsname=abcgof]")).click();
        driver.findElement(By.cssSelector("[jsname=WxTTNd]")).click();
        driver.findElement(By.cssSelector("[jsname=bkEvMb]")).click();
        driver.findElement(By.cssSelector("[jsname=Pt8tGc]")).click();
        assertEquals("infinity", driver.findElements(By.cssSelector("[jsname=VssY5c]")).size());
        assertEquals("6 ÷ 0 =", driver.findElements(By.cssSelector("[jsname=ubtiRe]")).size());
}
}