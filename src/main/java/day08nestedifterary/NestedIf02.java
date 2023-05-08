package day08nestedifterary;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("üçgenin geçerli kenarları için 3 tane sayı giriniz");
        double a=(input.nextDouble());
        double b=(input.nextDouble());
        double c=(input.nextDouble());


        boolean   ücgenMi =(a+b>c && c>Math.abs(a-b))&&(b+c>a&&a>Math.abs(a-b))&&(a+c>b&&b>Math.abs(a-c));
        if (ücgenMi){
            if (a==c&&a==b&&b==a){
                System.out.println("Ekanar üçgen");}else {if (a==b||a==c||b==c){
                System.out.println("İkizkenar");}else {
                System.out.println("çeşitkenar");}}}else {
            System.out.println("Üçgen değildir");}





    }
}
