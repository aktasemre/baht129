package kendiCalısmalarım;

import java.util.Scanner;

public class EgimCasısması {

    public static void main(String[] args) {

        Scanner input1= new Scanner(System.in);
        System.out.println("Lütfen dik kenar giriniz");
        float dikKenar= input1.nextFloat();

        System.out.println("Lütfen yatay kenar giriniz");
        float yatayKenar =input1.nextFloat();
       double c=Math.round( 100*dikKenar/yatayKenar);

        System.out.println("eiğm yaklaşık= %" +c);
    }}
