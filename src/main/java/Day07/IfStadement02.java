package Day07;

import java.util.Scanner;

public class IfStadement02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num=input.nextInt();
        if (num%2==0){
            System.out.println("Çift sayı");}
        if (num%2!=0){
            System.out.println("Tek sayı");}

        if (num%2==0){
            System.out.println("Çift sayı");}else {
            System.out.println("Tek Sayı");}

        Scanner num1=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num2=input.nextInt();

        if (num2>0){
            System.out.println("Pozitif sayı");}else if (num2<0){
            System.out.println("Negatif sayı");}else {
            System.out.println("Notr sayı");}






    }
}
