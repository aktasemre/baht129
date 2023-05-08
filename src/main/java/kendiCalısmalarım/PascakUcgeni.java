package kendiCalısmalarım;

import java.util.Scanner;

public class PascakUcgeni {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Kaç satırlı Paskal üçgeni istiyorsunuz.");


        int sayı=input.nextInt();


        for (int i = -sayı; i <=0; i++) {

            for (int j = -sayı; j <= sayı; j++) {
                int a = Math.abs(i);
                int b = Math.abs(j);
                if (a + b <= sayı) {
                    System.out.print("x");

                }
                if (a + b > sayı) {
                    System.out.print(" ");
                }


            }

        }}}
