package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDelTests extends TestBase{

    @Test
    public void testDelContact(){
        app.getNavigationHelper().openContactPage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().delSelectContact();
        app.getContactHelper().AssertTrue();
    }
}
