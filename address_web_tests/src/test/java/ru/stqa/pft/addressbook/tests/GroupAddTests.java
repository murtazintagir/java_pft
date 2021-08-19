package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd(){
    app.getNavigationHelper().openGroupPage();
    app.getGroupHelper().createGroup(new GroupData("name", "header", "footer"));
  }

}
