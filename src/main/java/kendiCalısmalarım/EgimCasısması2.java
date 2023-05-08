package kendiCalısmalarım;

import java.util.Scanner;

public class EgimCasısması2 {
    public static void main(String[] args) {

        Scanner input2=new Scanner(System.in);
        System.out.println("Lütfen egim açısını giriniz");
        float derece=input2.nextFloat();


        System.out.println("Lütfen yatay kenar giriniz");
        float yatayKenar= input2.nextFloat();
        double b=Math.toRadians(derece);
        float a=(float)((Math.tan(b))*yatayKenar);

        System.out.println("yükseklik  =" +a);}}
