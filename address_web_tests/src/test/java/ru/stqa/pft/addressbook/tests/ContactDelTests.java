package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDelTests extends TestBase{

    @Test
    public void testDelContact(){
        app.getNavigationHelper().openContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("first_name", "middle_name", "last_name",
                    "nickname", "title", "company", "address", "home", "mobile",
                    "work", "fax", "email", "email2", "email3", "homepage", "address2",
                    "phone2", "notes", "3", "July", "byear", "4", "April", "ayear", "[none]"), true);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().delSelectContact();
        app.getContactHelper().AssertTrue();
        app.getNavigationHelper().openContactPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
