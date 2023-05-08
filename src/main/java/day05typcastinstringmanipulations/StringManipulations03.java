package day05typcastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
       String pwd= input.nextLine();

       boolean first=pwd.length()>7;


        boolean secont=!pwd.contains(" ");


        boolean t1=pwd.replaceAll("[^A-Z]","").length()>0;


        boolean t2=pwd.replaceAll("[^0-9]","").length()>0;


        boolean t3=pwd.replaceAll("[^a-z]","").length()>0;


        boolean t4=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;


        System.out.println("şifre geçerli mi?   " + (t1 && t2 && t3 && first&&secont&& t4));


    }}
