package kendiCalısmalarım;

import java.util.Scanner;

public class HipotenüsBulma {
    public static void main(String[] args) {

        Scanner input1= new Scanner(System.in);
        System.out.println("lütfen 1.dik kenarı giriniz");
        float a= input1.nextFloat();

        Scanner input2= new Scanner(System.in);
        System.out.println("lütfen 2.dik kenar giriniz");
        float b=input2.nextFloat();

     float  hipotenüs=((a*a+b*b));
        System.out.println("hipotenüs=  " + Math.sqrt(hipotenüs));



    }
}
