package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Validate_ComfyElite {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled()) System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact us link validation PASSED");
        else System.out.println("Contact us link validation FAILED");

        WebElement firstName = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement message = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));

        String fName = "John";
        String lName = "Doe";
        String email2 = "johndoe@gmail.com";
        String message2 = "I love selenium";

        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        email.sendKeys(email2);
        message.sendKeys(message2);

        if (firstName.isDisplayed() && firstName.getAttribute("value").equals(fName)) System.out.println("First name input box validation PASSED");
        else System.out.println("First name input box validation PASSED");

        if (lastName.isDisplayed() && lastName.getAttribute("value").equals(lName)) System.out.println("Last name input box validation PASSED");
        else System.out.println("Last name input box validation FAILED");

        if (email.isDisplayed() && email.getAttribute("value").equals(email2)) System.out.println("Email input box validation PASSED");
        else System.out.println("Email input box validation FAILED");

        if (message.isDisplayed() && message.getAttribute("value").equals(message2)) System.out.println("Message input box validation PASSED");
        else System.out.println("Message input box validation FAILED");

        Driver.quitDriver();
    }
}
