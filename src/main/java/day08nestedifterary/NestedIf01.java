package day08nestedifterary;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        Scanner  input=new Scanner(System.in);
        System.out.println("üçgenin kenarları için 3 tane sayı giriniz");
        double a=(input.nextDouble());
        double b=(input.nextDouble());
        double c=(input.nextDouble());
    boolean   ücgenMi =(a+b>c && c>Math.abs(a-b))&&(b+c>a&&a>Math.abs(a-b))&&(a+c>b&&b>Math.abs(a-c));
    if (a<=0||b<=0||c<=0){
        System.out.println("üçgennin kenarları negatif veya '0' olamaz");}
       else if(ücgenMi){
           if (a==b&&a==c&&b==c){
               System.out.println("Üçgen hemde eşkenar üçgen");}else{
               System.out.println("Üçgen ama eşkenar değil");}} else {
            System.out.println("Sen üçgen değilsin");}







    }
}
