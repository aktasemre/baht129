package Calısmalarrım;

import java.util.Scanner;

import static Calısmalarrım.MetotOlustur.asalmi;

public class RunnerAsal {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int sayi = 1;


    System.out.println("LÜtfen bir sayı giriniz Çıkmak için 0 a basınız");
    do {

        sayi = input.nextInt();

        boolean b = asalmi(sayi);
        System.out.println("Asal mı?:" + b);
    } while (sayi != 0);


}
}
