package com.seed.web.controller;

/**
 * Created by OL on 2017/4/17.
 */
public class CustomerEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String company;
    private String email;
    private String address1;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    public CustomerEntity(int id,String firstName,String lastName,String company,
                          String email,String phone,String address,
                          String city,String state,String postalCode,String country){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.email=email;
        this.address1=address;
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
        this.country=country;
        this.phone=phone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
