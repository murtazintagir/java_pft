package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelTests extends TestBase {

    @Test
    public void testGroupDel(){
        app.getGroupHelper().openGroupPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().delSelectedGroup();
        app.getNavigationHelper().returnToGroupPage("group page");
    }

}
