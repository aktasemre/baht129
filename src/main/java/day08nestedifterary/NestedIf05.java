package day08nestedifterary;

import java.util.Scanner;

public class NestedIf05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

       double a=input.nextDouble();
        double b=input.nextDouble();


        if (a<b) {
            System.out.println(a);}else {
            System.out.println(b);}

     double sonuç=   a<b?a:b;
        System.out.println(sonuç);
    }
}
