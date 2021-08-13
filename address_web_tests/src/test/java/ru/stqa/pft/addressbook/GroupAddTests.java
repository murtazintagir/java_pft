package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd(){
    openGroupPage("groups");
    initGroupCreation("new");
    fillGroupForm(new GroupData("name", "header", "footer"));
    submitGroupCreation();
    returnToGroupPage("group page");
  }

}
