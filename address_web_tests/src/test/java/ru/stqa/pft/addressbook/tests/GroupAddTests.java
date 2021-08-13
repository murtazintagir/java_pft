package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd(){
    app.getGroupHelper().openGroupPage("groups");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("name", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getNavigationHelper().returnToGroupPage("group page");
  }

}
