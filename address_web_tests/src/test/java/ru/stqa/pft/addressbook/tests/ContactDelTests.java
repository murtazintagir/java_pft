package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDelTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().contactPage();
        if (app.contact().list().size() == 0){
            app.contact().create(new ContactData("first_name", "middle_name", "last_name",
                    "nickname", "title", "company", "address", "home", "mobile",
                    "work", "fax", "email", "email2", "email3", "homepage", "address2",
                    "phone2", "notes", "3", "July", "byear", "4", "April", "ayear", "[none]"), true);
        }
    }

    @Test(enabled = false)
    public void testDelContact(){
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().delete(index);
        app.goTo().contactPage();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), index);

        before.remove(index);
        Assert.assertEquals(before, after);
    }
}
