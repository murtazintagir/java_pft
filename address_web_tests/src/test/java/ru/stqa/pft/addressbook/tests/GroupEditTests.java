package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupEditTests extends TestBase {

    @Test
    public void testGroupEdit(){
        app.getNavigationHelper().openGroupPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupEdit("edit");
        app.getGroupHelper().fillGroupForm(new GroupData("name_edit", "header_edit", "footer_edit"));
        app.getGroupHelper().submitGroupEdit("update");
        app.getNavigationHelper().returnToGroupPage("group page");
    }
}
