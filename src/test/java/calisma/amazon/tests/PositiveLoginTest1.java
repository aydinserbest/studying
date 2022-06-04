package calisma.amazon.tests;

import calisma.amazon.utilities.ConfigurationReader;
import calisma.amazon.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest1 extends TestBase {

    @Test
    public void loginAmazon() throws InterruptedException {

        LoginPage login = new LoginPage();

        //page ilk acilis accept cookies
        driver.findElement(By.cssSelector("#sp-cc-accept")).click();

        //sign-in'i acmak icin  hover gerekli
        actions.moveToElement(login.hoverSign).perform();

        login.signClick.click();
        login.emailInput.sendKeys(ConfigurationReader.get("email"));
        login.cont.click();
        login.passwordInput.sendKeys(ConfigurationReader.get("password"));
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("metamorphosis");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),\"The Metamorphosis and Other Stories (Oxford World'\")]")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(2000);
        String expectedResult = "Added to Basket";
        String actualResult = driver.findElement(By.xpath("//span[contains(text(),'Added to Basket')]")).getText();
        Assert.assertEquals(actualResult,expectedResult);


    }

}
