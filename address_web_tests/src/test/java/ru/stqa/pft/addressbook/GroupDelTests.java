package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDelTests extends TestBase {

    @Test
    public void testGroupDel(){
        openGroupPage("groups");
        selectGroup();
        delSelectedGroup();
        returnToGroupPage("group page");
    }

}
