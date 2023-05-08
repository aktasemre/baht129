package genelTekrarSrouları;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {

         /************************************************************************
        15----
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
​
        Test Data:
        Java is fun
​
​
        Beklenen Çıktı
        0. pozisyondaki karakter : J
​
        5. pozisyondaki karakter : i
​
    ************************************************************************
        16----
        Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
​
        Test Data:
        java is fun
​
        Beklenen Çıktı:
        JAVA IS FUN
                ************************************************************************
​
        17---
                Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
​*/
            /*15*/
        Scanner input = new Scanner(System.in);

        String a="Java is fun";
        System.out.print("Kaçıncı karakteri istiyorsunuz:");
       int x=input.nextInt();
        System.out.println(a.charAt(x-1));

        /*17*/
        System.out.print("3 Sayı giriniz:");
        int i=input.nextInt();
        int j=input.nextInt();
        int k=input.nextInt();
      int Min=  Math.min(i,j);
        int t=Math.min(Min,k);
        System.out.println("En Küçük Sayı :"+t);

      int   min=i<j?i<k?i:k:j<k?j:k;
        System.out.println("en küçük 2. yol :"+min);
    }
}
