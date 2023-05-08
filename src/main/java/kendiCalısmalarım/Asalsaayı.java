package kendiCalısmalarım;

import java.util.Scanner;

public class Asalsaayı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        long sayı = scan.nextLong();

        for (int x=2;x>1;x++){int contrey=0;

        for (int i=2; i<Math.sqrt(x);i++) {

            if (x % i == 0) {
                contrey++;
            }
        }if (contrey == 0) {
                System.out.print(x+" ");}
        }

}}
