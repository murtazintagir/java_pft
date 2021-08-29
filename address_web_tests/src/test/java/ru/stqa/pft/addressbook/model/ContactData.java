package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private final String first_name;
    private final String middle_name;
    private final String last_name;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homepage;
    private final String address2;
    private final String phone2;
    private final String notes;
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String aday;
    private final String amonth;
    private final String ayear;
    private final String group;


    public ContactData(String first_name, String middle_name, String last_name, String nickname, String title,
                       String company, String address, String home, String mobile, String work, String fax, String email,
                       String email2, String email3, String homepage, String address2, String phone2, String notes, String bday,
                       String bmonth, String byear, String aday, String amonth, String ayear, String group) {
        this.id = Integer.MAX_VALUE;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
        this.group = group;
    }

    public ContactData(int id, String first_name, String middle_name, String last_name, String nickname, String title,
                       String company, String address, String home, String mobile, String work, String fax, String email,
                       String email2, String email3, String homepage, String address2, String phone2, String notes, String bday,
                       String bmonth, String byear, String aday, String amonth, String ayear, String group) {
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name(){
        return first_name;
    }

    public String getMiddle_name(){
        return middle_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public String getNickname(){
        return nickname;
    }

    public String getTitle(){
        return title;
    }

    public String getCompany(){
        return company;
    }

    public String getAddress(){
        return address;
    }

    public String getHome(){
        return home;
    }

    public String getMobile(){
        return mobile;
    }

    public String getWork(){
        return work;
    }

    public String getFax(){
        return fax;
    }

    public String getEmail(){
        return email;
    }

    public String getEmail2(){
        return email2;
    }

    public String getEmail3(){
        return email3;
    }

    public String getHomepage(){
        return homepage;
    }

    public String getAddress2(){
        return address2;
    }

    public String getPhone2(){
        return phone2;
    }

    public String getNotes(){
        return notes;
    }

    public String getBday(){
        return bday;
    }

    public String getBmonth(){
        return bmonth;
    }

    public String getByear(){
        return byear;
    }

    public String getAday(){
        return aday;
    }

    public String getAmonth(){
        return amonth;
    }

    public String getAyear(){
        return ayear;
    }

    public String getGroup(){
        return group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(first_name, that.first_name) && Objects.equals(last_name, that.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name);
    }
}
