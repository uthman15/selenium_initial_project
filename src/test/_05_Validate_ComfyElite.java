package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Validate_ComfyElite{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled())
            System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))
            System.out.println("Contact us link button validation PASSED");
        else System.out.println("Contact us link button validation FAILED");

        WebElement checkBoxInput = driver.findElement(By.cssSelector("input[data-ux='InputCheckbox']"));
        WebElement checkBoxDiv = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        checkBoxDiv.click();

        Thread.sleep(2000);
        boolean isCheckBoxSelected = false;
        if (checkBoxInput.isSelected()) isCheckBoxSelected = true;

        checkBoxDiv.click();
        Thread.sleep(2000);
        boolean isCheckBoxIsNotSelected = false;
        if (!checkBoxInput.isSelected()) isCheckBoxIsNotSelected = true;


        if (checkBoxDiv.isDisplayed() && isCheckBoxSelected && isCheckBoxIsNotSelected) System.out.println("Check box validation PASSED");
        else System.out.println("Check box validation FAILED");

        Driver.quitDriver();
    }
}