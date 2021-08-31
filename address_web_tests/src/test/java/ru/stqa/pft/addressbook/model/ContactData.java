package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id = Integer.MAX_VALUE;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String nickname;
    private String title;
    private String company;
    private String address;
    private String home;
    private String mobile;
    private String work;
    private String fax;
    private String email;
    private String email2;
    private String email3;
    private String homepage;
    private String address2;
    private String phone2;
    private String notes;
    private String bday;
    private String bmonth;
    private String byear;
    private String aday;
    private String amonth;
    private String ayear;
    private String group;

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public ContactData withFirst_name(String first_name){
        this.first_name = first_name;
        return this;
    }

    public ContactData withMiddle_name(String middle_name){
        this.middle_name = middle_name;
        return this;
    }

    public ContactData withLast_name(String last_name){
        this.last_name = last_name;
        return this;
    }

    public ContactData withNickname(String nickname){
        this.nickname = nickname;
        return this;
    }

    public ContactData withTitle(String title){
        this.title = title;
        return this;
    }

    public ContactData withCompany(String company){
        this.company = company;
        return this;
    }

    public ContactData withAddress(String address){
        this.address = address;
        return this;
    }

    public ContactData withHome(String home){
        this.home = home;
        return this;
    }

    public ContactData withMobile(String mobile){
        this.mobile = mobile;
        return this;
    }

    public ContactData withWork(String work){
        this.work = work;
        return this;
    }

    public ContactData withFax(String fax){
        this.fax = fax;
        return this;
    }

    public ContactData withEmail(String email){
        this.email = email;
        return this;
    }

    public ContactData withEmail2(String email2){
        this.email2 = email2;
        return this;
    }

    public ContactData withEmail3(String email3){
        this.email3 = email3;
        return this;
    }

    public ContactData withHomepage(String homepage){
        this.homepage = homepage;
        return this;
    }

    public ContactData withtAddress2(String address2){
        this.address2 = address2;
        return this;
    }

    public ContactData withPhone2(String phone2){
        this.phone2 = phone2;
        return this;
    }

    public ContactData withNotes(String notes){
        this.notes = notes;
        return this;
    }

    public ContactData withBday(String bday){
        this.bday = bday;
        return this;
    }

    public ContactData withBmonth(String bmonth){
        this.bmonth = bmonth;
        return this;
    }

    public ContactData withByear(String byear){
        this.byear = byear;
        return this;
    }

    public ContactData withAday(String aday){
        this.aday = aday;
        return this;
    }

    public ContactData withAmonth(String amonth){
        this.amonth = amonth;
        return this;
    }

    public ContactData withAyear(String ayear){
        this.ayear = ayear;
        return this;
    }

    public ContactData withGroup(String group){
        this.group = group;
        return this;
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
        return id == that.id && Objects.equals(first_name, that.first_name) && Objects.equals(last_name, that.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name);
    }
}
