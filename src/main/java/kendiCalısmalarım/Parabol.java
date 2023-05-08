package kendiCalısmalarım;

import java.util.Scanner;

public class Parabol {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir sayi giriniz");
        int sayı=input.nextInt();


        for (int j = 0; j <= 2*sayı; j++) {

            for (int i = -sayı; i <=sayı; i++) {
                int a=Math.abs(i);
                int b=Math.abs(j);
                if(i==j*j){
                    System.out.print("*");

                }
                if (i!=j*j){
                    System.out.print(" ");}

            }
            System.out.println();
        }

    }}

