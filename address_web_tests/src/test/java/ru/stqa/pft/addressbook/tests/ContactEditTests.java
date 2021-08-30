package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactEditTests extends TestBase{

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
    public void testEditContact(){
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().edit(index);
        ContactData contact = new ContactData().withId(before.get(index).getId()).withFirst_name("first_name").withMiddle_name("middle_name").
                withLast_name("last_name").withNickname("nickname").withTitle("title").withCompany("company").withAddress("address").
                withHome("home").withMobile("mobile").withWork("work").withFax("fax").withEmail("email").withEmail2("email2").
                withEmail3("email3").withHomepage("homepage").withtAddress2("address2").withPhone2("phone2").withNotes("notes").
                withBday("3").withBmonth("July").withByear("byear").withAday("4").withAmonth("April").withAyear("ayear");
        app.contact().edit(contact);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
