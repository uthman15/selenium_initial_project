package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _02_Validate_ComfyElite {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled()) System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact us link validation PASSED");
        else System.out.println("Contact us link validation FAILED");

        WebElement facebookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        WebElement instagramIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));

        if (facebookIcon.isDisplayed() && facebookIcon.isEnabled() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601"))
            System.out.println("Facebook icon validation PASSED");
        else System.out.println("Facebook icon validation FAILED");

        if (instagramIcon.isDisplayed() && instagramIcon.isEnabled() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite"))
            System.out.println("Instagram icon validation PASSED");
        else System.out.println("Instagram icon validation FAILED");

        Driver.quitDriver();

    }
}
