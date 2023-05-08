package genelTekrarSrouları;

import java.util.Scanner;

public class Soru12 {
   /*  13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
            ​
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
            ​
    Test Data:
    madam
​
    Beklenen Çıktı:
    True
    ************************************************************************
            14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.
            ​
            ​
    Test data:
            1. String : techproed.com
    2. String : Techproed.com
​
    Beklenen Çıktı:
    False
​
    Test data:
            1. String : techproed.com
    2. String : techproed.com
​
    Beklenen Çıktı:
            true
            ************************************************************************/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen polidromluğu kontol etmek isyediğiniz giriniz:");
        String ne1=input.nextLine();
      String  ne=ne1.replaceAll(" ","");
        int a=ne.length();
        int counter=0;
        for (int i = 0,k=a-1; i <a && k>-1;k-- ,i++) {

            if (ne.charAt(i)==ne.charAt(k)){
                counter++;}
            }

        System.out.println(counter==ne.length());

                /*14.soru*/

            String Kelime1="techproed.com";


        System.out.print("Lutfen aradığınız String i giriniz giriniz:");
        String kontrolKelime = input.nextLine();

        System.out.println(  kontrolKelime.equals(Kelime1));
        /*12.soru*/
        System.out.print("Lutfen Büyük harfe çevirmek istediğiniz String i giriniz giriniz:");

        String bigKelime = input.nextLine();
        System.out.println(bigKelime.toUpperCase());


        }}
