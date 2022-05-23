package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _01_Validate_ComfyElite {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled()) System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact us link validation PASSED");
        else System.out.println("Contact us link validation FAILED");

        WebElement comfyEliteLogo = driver.findElement(By.id("n-48560"));
        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));

        if (comfyEliteLogo.isDisplayed()) System.out.println("ComfyElite logo is displayed validation PASSED");
        else System.out.println("ComfyElite logo is displayed validation FAILED");

        if (heading2.isDisplayed() && heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home."))
            System.out.println("heading2 validation PASSED");
        else System.out.println("heading2 validation FAILED");


        Driver.quitDriver();

    }
}
