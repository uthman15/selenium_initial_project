package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _03_Validate_ComfyElite {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled()) System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact us link validation PASSED");
        else System.out.println("Contact us link validation FAILED");

        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-ux='SectionHeading']"));
        WebElement heading4 = driver.findElement(By.xpath("//h4[@data-ux='HeadingMinor']"));

        if (heading2.isDisplayed()) System.out.println("Heading2 link validation PASSED");
        else System.out.println("Heading2 link validation FAILED");

        if (heading4.isDisplayed()) System.out.println("Heading4 link validation PASSED");
        else System.out.println("Heading4 link validation FAILED");

        Driver.quitDriver();

    }
}
