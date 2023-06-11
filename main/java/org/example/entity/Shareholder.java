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

}
