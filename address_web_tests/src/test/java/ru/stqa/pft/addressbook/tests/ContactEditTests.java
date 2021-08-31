package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactEditTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().contactPage();
        if (app.contact().all().size() == 0){
        ContactData contact = new ContactData().withFirst_name("first_name").withMiddle_name("middle_name").withLast_name("last_name").
                withNickname("nickname").withTitle("title").withCompany("company").withAddress("address").withHome("home").
                withMobile("mobile").withWork("work").withFax("fax").withEmail("email").withEmail2("email2").withEmail3("email3").
                withHomepage("homepage").withtAddress2("address2").withPhone2("phone2").withNotes("notes").withBday("3").
                withBmonth("July").withByear("byear").withAday("4").withAmonth("April").withAyear("ayear").withGroup("[none]");
        app.contact().create(contact, true);
        }
    }

    @Test(enabled = true)
    public void testEditContact(){
        Contacts before = app.contact().all();
        ContactData editContact = before.iterator().next();
        ContactData contact = new ContactData().withId(editContact.getId()).withFirst_name("first_name").withMiddle_name("middle_name").
                withLast_name("last_name").withNickname("nickname").withTitle("title").withCompany("company").withAddress("address").
                withHome("home").withMobile("mobile").withWork("work").withFax("fax").withEmail("email").withEmail2("email2").
                withEmail3("email3").withHomepage("homepage").withtAddress2("address2").withPhone2("phone2").withNotes("notes").
                withBday("3").withBmonth("July").withByear("byear").withAday("4").withAmonth("April").withAyear("ayear");
        app.contact().edit(contact);
        assertThat(app.contact().count(), equalTo(before.size()));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before.without(editContact).withAdded(contact)));
    }
}
