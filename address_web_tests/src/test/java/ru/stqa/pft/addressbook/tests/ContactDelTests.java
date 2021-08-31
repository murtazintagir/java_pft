package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactDelTests extends TestBase{

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
    public void testDelContact(){
        Contacts before = app.contact().all();
        ContactData deleteContact = before.iterator().next();
        app.contact().delete(deleteContact);
        app.goTo().contactPage();
        assertThat(app.contact().count(), equalTo(before.size() - 1));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before.without(deleteContact)));
    }
}
