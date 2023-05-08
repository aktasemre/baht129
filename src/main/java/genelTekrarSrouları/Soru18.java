package genelTekrarSrouları;

import java.util.Scanner;

public class Soru18 {
     /* 18----
    Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
            ​
    Stringdeki sesli harf sayısı: 4
            ​
            ************************************************************************
            19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
            ​
    Test Data:
            2017
            ​
    Beklenen Çıktı:
            false*/
     public static void main(String[] args) {

            /*18*/
         Scanner input = new Scanner(System.in);
         System.out.print("Lutfen Bir cümle sayi giriniz:");
         String caracter = input.nextLine();
           int countre=0;
         for (int i = 0; i <caracter.length() ; i++) {


                 switch (caracter.charAt(i)){
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
                     countre++;}}
         System.out.println(countre);

     }
}
