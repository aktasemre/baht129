package day08nestedifterary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {


            Scanner input=new Scanner(System.in);
            System.out.println("Cinsiyetini giriniz. 'Erkek','Kadın','Diğerler'");

           String gener=input.next();

        System.out.println("Lütfen yaşınızı giriniz");
       int age= input.nextInt();
       if (age<0||age>120){
           System.out.println("Lütfen yaşınızı 0 ve 120 arasında giriniz");}else {
       if (gener.equalsIgnoreCase("kadın")) {
           if (age > 60) {
               System.out.println("Emekli olabilir");
           } else {
               System.out.println("Calısmalı");
           }

       }else if (gener.equalsIgnoreCase("Erkek")){
           if (age > 65) {
           System.out.println("Emekli olabilir");
       } else {
           System.out.println("Calısmalı");}}





       }

    }
}
