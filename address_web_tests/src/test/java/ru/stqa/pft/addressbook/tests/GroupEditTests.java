package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupEditTests extends TestBase {

    @Test
    public void testGroupEdit(){
        app.getNavigationHelper().openGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupEdit();
        app.getGroupHelper().fillGroupForm(new GroupData("name_edit", "header_edit", "footer_edit"));
        app.getGroupHelper().submitGroupEdit();
        app.getNavigationHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }
}
