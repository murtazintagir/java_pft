package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactEditTests extends TestBase{

    @Test
    public void testEditContact(){
        app.getNavigationHelper().openContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("first_name", "middle_name", "last_name",
                    "nickname", "title", "company", "address", "home", "mobile",
                    "work", "fax", "email", "email2", "email3", "homepage", "address2",
                    "phone2", "notes", "3", "July", "byear", "4", "April", "ayear", "[none]"), true);
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("first", "middle_name", "last_name",
                "nickname", "title", "company", "address", "home", "mobile",
                "work", "fax", "email", "email2", "email3", "homepage", "address2",
                "phone2", "notes", "3", "July", "byear", "4", "April", "ayear", null), false);
        app.getContactHelper().submitContactEdit();
        app.getNavigationHelper().returnToHomePage();
    }
}
