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
        driver.findElement(By.cssSelector("[jsname=lVjWed]")).click();
        assertEquals(4, 3, driver.findElements(By.cssSelector("[jsname=ubtiRe]")).size());
        assertEquals(1,driver.findElements(By.cssSelector("[jsname=a1lrmb]")).size());
        assertEquals(2,details);
    }
    }
