package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

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
        type(By.name("firstname"), contactData.getFirst_name());
        type(By.name("middlename"),contactData.getMiddle_name());
        type(By.name("lastname"),contactData.getLast_name());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("title"),contactData.getTitle());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        type(By.name("home"),contactData.getHome());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("work"),contactData.getWork());
        type(By.name("fax"),contactData.getFax());
        type(By.name("email"),contactData.getEmail());
        type(By.name("email2"),contactData.getEmail2());
        type(By.name("email3"),contactData.getEmail3());
        type_select(By.name("bday"), contactData.getBday());
        type_select(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"),contactData.getByear());
        type_select(By.name("aday"), contactData.getAday());
        type_select(By.name("amonth"), contactData.getAmonth());
        type(By.name("ayear"),contactData.getAyear());
        if (creation) {
            type_select(By.name("new_group"), contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        type(By.name("homepage"),contactData.getHomepage());
        type(By.name("address2"),contactData.getAddress2());
        type(By.name("phone2"),contactData.getPhone2());
        type(By.name("notes"),contactData.getNotes());
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
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element: elements){
            List <WebElement> cells=element.findElements(By.tagName("td"));
            String last_name = cells.get(1).getText();
            String first_name = cells.get(2).getText();
            int id = Integer.parseInt(element.findElement(By.cssSelector("input")).getAttribute("value"));
            ContactData contact = new ContactData(id, first_name, null, last_name, null, null,
                    null, null, null, null, null, null, null,null,
                    null,null,null,null,null,null,null,null,
                    null,null,null,null);
            contacts.add(contact);
        }
        return contacts;

    }
}
