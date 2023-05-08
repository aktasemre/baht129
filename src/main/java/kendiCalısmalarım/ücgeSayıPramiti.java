package kendiCalısmalarım;

import java.util.Scanner;

public class ücgeSayıPramiti {
    public static void main(String[] args) {

        /*
         Şekli Yazdırınız:

           1 2 3 4 5 6
            2 3 4 5 6
             3 4 5 6
              4 5 6
               5 6
        */
        System.out.println("lütfen Oluşturmak istediğiniz üçgen sayısını giriniz");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
               n=n+1;
        for (int i=1;i<n;i++){
            if (i%2==0){for (int j=0;j<(2*i-1)/2;j++){
                System.out.print(" ");}}else if (i%2!=0){for (int j=0;j<(2*i-1)/2;j++){
                System.out.print(" ");}}



                    for (int k=i;k<n;k++){

                System.out.print(k+" ");
            }
            System.out.println();

        }}}
