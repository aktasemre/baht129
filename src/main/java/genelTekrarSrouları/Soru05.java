package genelTekrarSrouları;

import java.util.Scanner;
// 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
/*         Test Data:
         Yarım elmas uzunluğu : 7
         Beklenen Çıktı:
         *
         ***
         *****
         *******
         *********
         ***********
         *************
         ***********
         *********
         *******
         *****
         ***
         **/
public class Soru05 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir sayi giriniz:");
        int sayı = input.nextInt();


        for (int i = -sayı; i <= sayı; i++) {

            for (int j = -sayı; j <= sayı; j++) {
                int a = Math.abs(i);
                int b = Math.abs(j);
                if (a + b <= sayı) {
                    System.out.print("*");

                }
                if (a + b > sayı ) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }}
