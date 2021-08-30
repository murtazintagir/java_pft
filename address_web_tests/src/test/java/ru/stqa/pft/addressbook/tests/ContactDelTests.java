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
            ContactData contact = new ContactData().withFirst_name("first_name").withMiddle_name("middle_name").withLast_name("last_name").
                    withNickname("nickname").withTitle("title").withCompany("company").withAddress("address").withHome("home").
                    withMobile("mobile").withWork("work").withFax("fax").withEmail("email").withEmail2("email2").withEmail3("email3").
                    withHomepage("homepage").withtAddress2("address2").withPhone2("phone2").withNotes("notes").withBday("3").
                    withBmonth("July").withByear("byear").withAday("4").withAmonth("April").withAyear("ayear").withGroup("[none]");
            app.contact().create(contact, true);
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
