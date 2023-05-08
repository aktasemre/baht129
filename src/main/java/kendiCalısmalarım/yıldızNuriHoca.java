package kendiCalısmalarım;

import java.util.Scanner;

public class yıldızNuriHoca {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in) ;
     System.out.println("Lutfen Bir sayi giriniz");

    int num = input.nextInt();

       for (int i = 0; i < num; i++) {

        for (int j =i; j <num-1; j++) {

            System.out.print(" ");
        }

        for (int m =1 ; m<=2*i+1 ; m++) {
            System.out.print("*");

        }System.out.println();

    }

    for (int i = 1; i < num; i++) {

        for (int j =1; j <i+1; j++) {

            System.out.print(" ");
        }

        for (int n =2*num ; n >2*i+1 ; n--) {
            System.out.print("*");

        }System.out.println();

    }}

        }

