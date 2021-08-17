package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
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
        type(By.name("homepage"),contactData.homepage());
        type(By.name("address2"),contactData.address2());
        type(By.name("phone2"),contactData.phone2());
        type(By.name("notes"),contactData.notes());
        type_select(By.name("bday"), contactData.bday());
        type_select(By.name("bmonth"), contactData.bmonth());
        type(By.name("byear"),contactData.byear());
        type_select(By.name("aday"), contactData.aday());
        type_select(By.name("amonth"), contactData.amonth());
        type(By.name("ayear"),contactData.ayear());
    }

    public void initContactCreation(String c) {
        click(By.linkText(c));
    }

    public void selectContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactEdit(String u) {
        click(By.name(u));
    }
}
