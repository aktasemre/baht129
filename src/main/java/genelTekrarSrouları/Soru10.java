package genelTekrarSrouları;

import java.util.Scanner;

public class Soru10 {
   /* 10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
            ​
    Test Data:
    Java is easy
​
    Aranan String: is
​
    Bektenen Çıktı:
    True
​
    Aranan String: and
​
    Beklenen Çıktı:False
    ************************************************************************
            11----
    Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
​
    Test Data:
    good
​
    Beklenen Çıktı:
    goo
    ************************************************************************/
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Lutfen aradığınız kelimeyi giriniz:");
       String ne=input.nextLine();
       String kelime = "Java is money";
               ne= ne.toLowerCase();
               kelime=kelime.toLowerCase();
       boolean a= kelime.contains(ne);
       System.out.println(a);


       System.out.print("Lutfen bir kelime giriniz:");
       String sonSil=input.nextLine();

       int ch=((sonSil.length()));
           String ok=sonSil.substring(0,ch);
       System.out.println(ok);

   }

}
