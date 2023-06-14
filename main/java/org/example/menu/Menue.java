package org.example.menu;

import org.example.entity.User;

import java.util.Scanner;

public class Menue {
Scanner scanner=new Scanner(System.in);
    public void singIn() {
        System.out.println("singIn");


    }
    public User singUp() {
        System.out.println("singUp");
        System.out.println("enter firstname");
        String firstName = scanner.nextLine();
        System.out.println("enter lastname");
        String lastname=scanner.nextLine();
        System.out.println("enter email");
        String email=scanner.nextLine();
        System.out.println("enter password");
        String password=scanner.nextLine();

        return new User(firstName,lastname,email,password);
        }


    public void runMenu(){
        String [] armin={"===welcome to business===","1=singIn","2=singUp",};
        for (String panel:armin){
            System.out.println(panel);
        }
    }

    public void run(){
        boolean flag=true;
        Scanner scanner=new Scanner(System.in);
        while (flag){
            runMenu();
            String command1=scanner.nextLine();
            switch (command1) {
                case ("1"):{
                    singIn();
                }
                case ("2"):{
                    singUp();
                }
                default: invalidCommand();
            }
        }
    }

    public void invalidCommand(){
        System.out.println("between number 1 to 2");
    }

}
