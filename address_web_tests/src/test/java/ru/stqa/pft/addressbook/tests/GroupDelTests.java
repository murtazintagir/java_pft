package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelTests extends TestBase {

    @Test
    public void testGroupDel(){
        app.openGroupPage("groups");
        app.selectGroup();
        app.delSelectedGroup();
        app.returnToGroupPage("group page");
    }

}
