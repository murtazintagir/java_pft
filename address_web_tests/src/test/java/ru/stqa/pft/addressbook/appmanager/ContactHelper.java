package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"),contactData.first_name());
        type(By.name("middlename"),contactData.middle_name());
        type(By.name("lastname"),contactData.last_name());
        type(By.name("nickname"),contactData.nickname());
        type(By.name("title"),contactData.title());
        type(By.name("company"),contactData.company());
        type(By.name("address"),contactData.address());
        type(By.name("home"),contactData.home());
        type(By.name("mobile"),contactData.mobile());
        type(By.name("work"),contactData.work());
        type(By.name("fax"),contactData.fax());
        type(By.name("email"),contactData.email());
        type(By.name("email2"),contactData.email2());
        type(By.name("email3"),contactData.email3());
        type_select(By.name("bday"), contactData.bday());
        type_select(By.name("bmonth"), contactData.bmonth());
        type(By.name("byear"),contactData.byear());
        type_select(By.name("aday"), contactData.aday());
        type_select(By.name("amonth"), contactData.amonth());
        type(By.name("ayear"),contactData.ayear());
        if (creation) {
            type_select(By.name("new_group"), contactData.group());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        type(By.name("homepage"),contactData.homepage());
        type(By.name("address2"),contactData.address2());
        type(By.name("phone2"),contactData.phone2());
        type(By.name("notes"),contactData.notes());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void editContact(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }

    public void submitContactEdit() {
        click(By.name("update"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void delSelectContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void submitContactDel(String d) {
        click(By.name(d));
    }

    public void AssertTrue() {
        wd.switchTo().alert().accept();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contactData, boolean b) {
        initContactCreation();
        fillContactForm(contactData, b);
        submitContactCreation();
        returnToHomePage();

    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("[name=entry]"));
    }
}
