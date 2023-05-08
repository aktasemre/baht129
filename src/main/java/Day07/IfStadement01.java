package Day07;

import java.util.Scanner;

public class IfStadement01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char ch=input.next().charAt(0);
        if (ch>='A'&& ch<='Z'){
        System.out.println("Büyük harf");}

        if (ch>='a' && ch<='z'){
            System.out.println("Küçük harf");}


        if (ch>='A'&& ch<='Z'){
            System.out.println("Büyük harf");}
            else if ((ch>='a'&&ch<='z')){
            System.out.println("Kücük harf");}
            else {
            System.out.println("harf değil");}







    }
}
