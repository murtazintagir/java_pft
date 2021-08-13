package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactAddTests {
    private WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("user", "pass", By.xpath("//input[@value='Login']"), "admin", "secret");
    }

    private void login(String user, String pass, By xpath, String username, String password) {
        wd.findElement(By.name(user)).clear();
        wd.findElement(By.name(user)).sendKeys(username);
        wd.findElement(By.name(pass)).clear();
        wd.findElement(By.name(pass)).sendKeys(password);
        wd.findElement(xpath).click();
    }
    @Test
    public void testContactAdd() throws Exception {
        openContactPage("home");
        initContactCreation("add new");
        fillContactForm(new ContactData("first_name", "middle_name", "last_name",
                "nickname", "title", "company", "address", "home", "mobile",
                "work", "fax", "email", "email2", "email3", "homepage", "address2",
                "phone2", "notes", "3", "July", "byear", "4", "April", "ayear"));
        submitContactCreation();
        returnToHomePage("home page");
    }

    private void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.first_name());
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.middle_name());
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.last_name());
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(contactData.nickname());
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(contactData.title());
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(contactData.company());
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(contactData.address());
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(contactData.home());
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.mobile());
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(contactData.work());
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys(contactData.fax());
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.email());
        wd.findElement(By.name("email2")).clear();
        wd.findElement(By.name("email2")).sendKeys(contactData.email2());
        wd.findElement(By.name("email3")).clear();
        wd.findElement(By.name("email3")).sendKeys(contactData.email3());
        wd.findElement(By.name("homepage")).clear();
        wd.findElement(By.name("homepage")).sendKeys(contactData.homepage());
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(contactData.address2());
        wd.findElement(By.name("phone2")).clear();
        wd.findElement(By.name("phone2")).sendKeys(contactData.phone2());
        wd.findElement(By.name("notes")).clear();
        wd.findElement(By.name("notes")).sendKeys(contactData.notes());
        wd.findElement(By.name("bday")).click();
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.bday());
        wd.findElement(By.name("bmonth")).click();
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.bmonth());
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(contactData.byear());
        wd.findElement(By.name("aday")).click();
        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.aday());
        wd.findElement(By.name("amonth")).click();
        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.amonth());
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys(contactData.ayear());
    }

    private void returnToHomePage(String h) {
        wd.findElement(By.linkText(h)).click();
    }

    private void initContactCreation(String c) {
        wd.findElement(By.linkText(c)).click();
    }

    private void openContactPage(String contact) {
        wd.findElement(By.linkText(contact)).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.findElement(By.linkText("Logout")).click();
        wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
