package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactAddTests extends TestBase{

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
}
