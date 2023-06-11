package org.example.entity;

public class Shareholder {
    private  int id;
    private String name;
    private int phoneNumber;
    private int nationalCode;

    public Shareholder(int id, String name, int phoneNumber, int nationalCode) {
        this.id = id;
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.nationalCode = nationalCode;
    }

    public Shareholder(String name, int phoneNumber, int nationalCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }
}
