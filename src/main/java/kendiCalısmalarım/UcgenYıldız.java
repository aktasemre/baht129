package kendiCalısmalarım;

import java.util.Scanner;

public class UcgenYıldız {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir sayi giriniz:");
        int sayı = input.nextInt();

        for (int i = 0; i <= sayı; i++) {

            for (int k = i; k <(2*sayı+1)/2 ; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {

                int yaz = C(i, j);
                System.out.print("  " + yaz);
            }
            System.out.println();
        }
    }





    public static  int faktöriel(int n){
        int  çarp = 1;
        for (int i = 2; i <n+1 ; i++) {
            çarp=çarp*i;
        }

        return çarp;
    }
    public static int C(int n, int r){
      int  kombinasyon=1;
        if(n!=0||r!=0){
          kombinasyon= faktöriel(n)/(faktöriel(r)*faktöriel(n-r));
       }
        return kombinasyon;
    }

}
