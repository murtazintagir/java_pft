package ru.stqa.pft.addressbook.model;

public record ContactData(String first_name, String middle_name, String last_name, String nickname, String title,
                          String company, String address, String home, String mobile, String work, String fax,
                          String email, String email2, String email3, String homepage, String address2, String phone2,
                          String notes, String bday, String bmonth, String byear, String aday, String amonth, String ayear,
                          String group) {
}