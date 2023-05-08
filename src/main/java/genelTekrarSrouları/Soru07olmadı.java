package genelTekrarSrouları;

import java.util.Scanner;

public class Soru07olmadı {

  /*  7-----
    Ugly Number:
            ​
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
            ​
            ​
    Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
            ​
    Test Data:
            13
            ​
    Beklenen çıktı:
    ugly number  degildir
​
    Test Data:
            25
    Beklenen Çıktı:
            ​
    ugly number
     ************************************************************************
*/
  public static void main(String[] args) {

    int  sonuç2=1,sonuç3=1,sonuç5=1;

      Scanner scan = new Scanner(System.in);
      System.out.print("Bir sayi giriniz: ");
      long sayı = scan.nextLong();

      for (int i = 1; i <sayı ; i++) {

          sonuç2*=sonuç2*2;
          sonuç3*=sonuç3*3;
          sonuç5*=sonuç5*5;
            if (sayı==sonuç2||sayı==sonuç3||sayı==sonuç5){
                System.out.println("**");}

      }

          }

      }

