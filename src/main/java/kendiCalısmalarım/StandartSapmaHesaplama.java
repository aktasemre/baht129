package kendiCalısmalarım;

import java.util.Scanner;

public class StandartSapmaHesaplama {
    public static void main(String[] args) {

    Scanner input1=new Scanner(System.in);

    System.out.println("Lütfen 4 adet sayı giriniz");
 float a1=input1.nextFloat(); float a2=input1.nextFloat(); float a3=input1.nextFloat(); float a4=input1.nextFloat();
    float x=((a1+a2+a3+a4))/4;

    float  A=(((x-a1)*(x-a1)+(x-a2)*(x-a2)+(x-a3)*(x-a3)+(x-a4)*(x-a4))/3);
        System.out.println("Standart sapma  =" +Math.sqrt(A));

    }
}
