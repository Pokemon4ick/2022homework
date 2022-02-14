package tests;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class case1 {
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
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("[jsname=j93WEe]")).click();
        driver.findElement(By.cssSelector("[jsname=N10B9]")).click();
        driver.findElement(By.cssSelector("[jsname=XSr6wc]")).click();
        driver.findElement(By.cssSelector("[jsname=lVjWed]")).click();
        driver.findElement(By.cssSelector("[jsname=qCp9A]")).click();
        driver.findElement(By.cssSelector("[jsname=YovRWb]")).click();
        driver.findElement(By.cssSelector("[jsname=KN1kY]")).click();
        driver.findElement(By.cssSelector("[jsname=pPHzQc]")).click();
        driver.findElement(By.cssSelector("[jsname=xAP7E]")).click();
        driver.findElement(By.cssSelector("[jsname=bkEvMb]")).click();
        driver.findElement(By.cssSelector("[jsname=WxTTNd]")).click();
        driver.findElement(By.cssSelector("[jsname=Ax5wH]")).click();
        driver.findElement(By.cssSelector("[jsname=Pt8tGc]")).click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElements(By.cssSelector("[jsname=ubtiRe]")).size());
        assertEquals("1", driver.findElements(By.cssSelector("[jsname=VssY5c]")).size());
    }
    }
