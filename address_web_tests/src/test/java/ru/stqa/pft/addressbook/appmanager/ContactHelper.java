package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper {
    private WebDriver wd;

    public ContactHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
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

    public void initContactCreation(String c) {
        wd.findElement(By.linkText(c)).click();
    }
}
