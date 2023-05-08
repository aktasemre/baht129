package kendiCalısmalarım;

import java.util.Scanner;

public class EgimCalısmasıİf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("1-Dik kenar-ve-Yatay Kenar = Eğim");
        System.out.println("2-Dik kenar-ve-Egim Açısı = Yatay uzunluk");
        System.out.println("3-Yatay kenar-ve-Egim Acısı = Dik uzunluk");
        System.out.println("*******************************************");
        System.out.println("lütfen işlem seçiniz");
        float YD=input.nextFloat();


    if (YD==1){{

        Scanner input1= new Scanner(System.in);
        System.out.println("Lütfen dik kenar giriniz");
        float dikKenar= input1.nextFloat();

        System.out.println("Lütfen yatay kenar giriniz");
        float yatayKenar =input1.nextFloat();
        double c=Math.round( 100*dikKenar/yatayKenar);

        System.out.println("eiğm yaklaşık= %" +c);
    }} else if (YD==2) {Scanner input2=new Scanner(System.in);
        System.out.println("Lütfen egim açısını giriniz");
        float derece=input2.nextFloat();


        System.out.println("Lütfen yatay Dik Uzunluğu");
        float dik= input2.nextFloat();
        double b=Math.toRadians(derece);
        float a=(float)(dik/(Math.tan(b)));

        System.out.println("Yatay Uzunluk: x=" +a);}

        else if (YD==3) {Scanner input2=new Scanner(System.in);
        System.out.println("Lütfen egim açısını giriniz");
        float derece=input2.nextFloat();


        System.out.println("Lütfen yatay kenar giriniz");
        float yatayKenar= input2.nextFloat();
        double b=Math.toRadians(derece);
        float a=(float)((Math.tan(b))*yatayKenar);

        System.out.println("yükseklik:  h=" +a);}else {
        System.out.println("Lütfen geçerli bir işlem seçiniz");}
    }}
