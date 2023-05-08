package kendiCalısmalarım;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
            int   sayı= input.nextInt();
        for (int i =-sayı; i <sayı+1 ; i++) {

            for (int j = -sayı-1; j <sayı+1 ; j++) {

                if ((i*i)+(j*j)==sayı*sayı||(i*i)+(j*j)==(sayı-2)*(sayı-2)||(i*i)+(j*j)==(sayı-1)*(sayı-1)){
                    System.out.print(" * ");}
                    if ((i*i)+(j*j)>sayı*sayı|| ((i*i)+(j*j)<((sayı-2)*(sayı-2)))){
                        System.out.print("   ");}

            }
            System.out.println();

        }


    }
}
