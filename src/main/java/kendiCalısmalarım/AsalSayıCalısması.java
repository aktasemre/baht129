package kendiCalısmalarım;

import java.util.Scanner;

public class AsalSayıCalısması {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        long k = scan.nextLong();

        for (long sayi=2;sayi<k+1;sayi++){
        long sayac = 0;

        for (long i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.print(sayi + " ");
        } }
    }
}
