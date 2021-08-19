package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDelTests extends TestBase {

    @Test
    public void testGroupDel(){
        app.getNavigationHelper().openGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().delSelectedGroup();
        app.getNavigationHelper().returnToGroupPage();
    }

}
