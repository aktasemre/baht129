package genelTekrarSrouları;

import java.util.Scanner;

public class Soru06 {
    /*7/

     6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
            ​
    Sesli harfler: a,e,i,o,u
​
    Test Data:
    a
​
    Beklenen Çıktı:
    a harfi sesli harfdir.
            ​
    Test Data:
    d
​
    Beklenen Çıktı:
    d harfi sesiz harftir.
            ​
    Test Data:
    we  yada %
            ​
    Beklenen Çıktı:
    Yanlis karakter girdiniz!*/


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir karakter sayi giriniz:");
        String caracter = input.nextLine();
          boolean  a=caracter.trim().replaceAll("[^a-zA-Z]","").length()==0;
          boolean  b=caracter.trim().length()>1;
       if ( a || b  ){
           System.out.println("Yanlis karakter girdiniz!");}else
       switch (caracter.charAt(0)){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
               System.out.println(caracter+" "+"harfi sesli harfdir.");
            break;
           default:
               System.out.println(caracter +" " + "harfi sesiz harftir.");
       }
    }
}