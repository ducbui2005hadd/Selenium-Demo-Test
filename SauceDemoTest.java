import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SauceDemoTest {

    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        assertTrue(driver.getCurrentUrl().contains("inventory"));

        driver.quit();
    }

    @Test
    public void addToCartTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        String badge = driver.findElement(By.className("shopping_cart_badge"))
                .getText();

        assertTrue(badge.equals("1"));

        driver.quit();
    }

    @Test
    public void logoutTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("react-burger-menu-btn"))
                .click();

        driver.findElement(By.id("logout_sidebar_link"))
                .click();

        assertTrue(driver.getCurrentUrl().contains("saucedemo"));

        driver.quit();
    }
}