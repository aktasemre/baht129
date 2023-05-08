package kendiCalısmalarım;

import java.util.Scanner;

public class Yıldızücgen02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int kenar=input.nextInt();




        for (int i=1;i<kenar;i++){
            for (int k=1;k<2*kenar;k++){

                if (i+k==kenar || k-i==kenar){
                    System.out.println("*");}else System.out.print( " ");



            }
        }






    }

}
