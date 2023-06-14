package org.example.entity;

public class Shareholder {
    private  int id;
    private static String name;
    private static int phoneNumber;
    private static int nationalCode;

    public Shareholder(int id, String name, int phoneNumber, int nationalCode) {
        this.id = id;
        Shareholder.name = name;
        Shareholder.phoneNumber =phoneNumber;
        Shareholder.nationalCode = nationalCode;
    }

    public Shareholder(String name, int phoneNumber, int nationalCode) {
        Shareholder.name = name;
        Shareholder.phoneNumber = phoneNumber;
        Shareholder.nationalCode = nationalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Shareholder.name = name;
    }

    public static int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        Shareholder.phoneNumber = phoneNumber;
    }

    public static int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        Shareholder.nationalCode = nationalCode;
    }
}
