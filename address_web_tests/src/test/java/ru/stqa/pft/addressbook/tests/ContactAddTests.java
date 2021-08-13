package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactAddTests extends TestBase{

    @Test
    public void testContactAdd() throws Exception {
        app.openContactPage("home");
        app.initContactCreation("add new");
        app.fillContactForm(new ContactData("first_name", "middle_name", "last_name",
                "nickname", "title", "company", "address", "home", "mobile",
                "work", "fax", "email", "email2", "email3", "homepage", "address2",
                "phone2", "notes", "3", "July", "byear", "4", "April", "ayear"));
        app.submitContactCreation();
        app.returnToHomePage("home page");
    }
}
