package day08nestedifterary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd=input.nextLine();

        char firstChar=pwd.charAt(0);

        if (pwd.charAt(0)>='A' &&pwd.charAt(0)<='Z'){

            if (pwd.charAt(0)=='A'){
                System.out.println("geçerli şifre");

            } else {System.out.println("Geçersiz çünkü 'A'değil");}}else

            {if (pwd.charAt(0)>='a' &&pwd.charAt(0)<='z'){


                if (pwd.charAt(0)=='z'){
                System.out.println("geçerli şifre");

            } else {
                System.out.println("Geçersiz çünkü küçük harf ama 'z'değil");}

            }else {
            System.out.println("ilk kaeraktrer harf olmalı");}}






    }}

