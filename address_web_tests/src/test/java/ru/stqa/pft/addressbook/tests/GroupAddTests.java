package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd(){
    app.openGroupPage("groups");
    app.initGroupCreation("new");
    app.fillGroupForm(new GroupData("name", "header", "footer"));
    app.submitGroupCreation();
    app.returnToGroupPage("group page");
  }

}
