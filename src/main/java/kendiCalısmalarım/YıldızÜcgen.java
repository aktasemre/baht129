package kendiCalısmalarım;

import java.util.Scanner;

public class YıldızÜcgen{

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen Kenar uzunluğunu giriniz = ");
           int kenar = scan.nextInt();

            for (int i = 0; i <kenar ; i++)
            {for (int k = 0; k <2*kenar; k++)
            {if ((i + k == kenar || k - i == kenar))
            {
                        System.out.print("*");}

            else if ((i + k >= kenar&&k - i <= kenar))
            {System.out.print(" ");} else {System.out.print(" ");}
            }
                System.out.println();}

            for (int t=0;t<kenar+1;t++){
                System.out.print("* ");}
        }}