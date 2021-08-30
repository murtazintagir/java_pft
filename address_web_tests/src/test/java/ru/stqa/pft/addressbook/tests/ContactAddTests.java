package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactAddTests extends TestBase{

    @Test(enabled = false)
    public void testContactAdd(){
        app.goTo().contactPage();
        List<ContactData> before = app.contact().list();
        ContactData contact = new ContactData().withFirst_name("first_name").withMiddle_name("middle_name").withLast_name("last_name").
                withNickname("nickname").withTitle("title").withCompany("company").withAddress("address").withHome("home").
                withMobile("mobile").withWork("work").withFax("fax").withEmail("email").withEmail2("email2").withEmail3("email3").
                withHomepage("homepage").withtAddress2("address2").withPhone2("phone2").withNotes("notes").withBday("3").
                withBmonth("July").withByear("byear").withAday("4").withAmonth("April").withAyear("ayear").withGroup("[none]");
        app.contact().create(contact, true);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
