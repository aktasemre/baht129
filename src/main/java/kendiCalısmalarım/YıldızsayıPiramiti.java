package kendiCalısmalarım;

import java.util.Scanner;

public class YıldızsayıPiramiti {
    public static void main(String[] args) {

        /*
            Asagidaki sekli cizen kodu yaziniz
                                *
                               * *
                              *   *
                             *     *
                            * * * * *
         */
        System.out.println("lütfen Oluşturmak istediğiniz üçgen sayısını giriniz");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for (int k=0;k<n;k++){
            System.out.print(" ");}
        System.out.println("*");

        for (int i=0;i<n;i++) {

          for (int k=n-1;k>(2*i+1)/2;k--){ System.out.print(" ");}
            System.out.println("*");}




}}
