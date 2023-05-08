package genelTekrarSrouları;

public class Soru01 {

     /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
​
    Test Data
    34
    Beklenen Çıktı
    7
    *********************************************************************
    2---1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
    ************************************************************************

      */

    public static void main(String[] args) {

        int num =34;
      int  top=num%10;
      int  top2=num/10;
        System.out.println(top);
        System.out.println(top2);

        System.out.println(top+top2);





        for (int i = 1; i <21 ; i++) {

            System.out.println(i);

        }



    }
}
