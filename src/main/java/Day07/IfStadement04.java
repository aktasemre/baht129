package Day07;

import java.util.Scanner;

public class IfStadement04 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün");
        int num=input.nextInt();

        if (num==1){
            System.out.println("Sunday");}
        else  if (num==2){
            System.out.println("Monday");}
        else if (num==3){
            System.out.println("Tuersday");}

        else if (num==4){
            System.out.println("Westerday");}
        else if (num==5){
            System.out.println("Thurssday");}
        else if (num==6){
       System.out.println("Friday");}
        else if (num==7){
            System.out.println("Saturday");}
        else {
            System.out.println("Hatalı giriş yaptınız Lütfen 1 den 7 ye kadar olan sayılardan giriniz");}








    }
}
