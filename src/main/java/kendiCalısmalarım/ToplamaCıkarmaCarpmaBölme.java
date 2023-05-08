package kendiCalısmalarım;

import java.util.Scanner;

public class ToplamaCıkarmaCarpmaBölme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("1-toplama");
        System.out.println("2-cıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");


        System.out.println("Bir işlem seçiniz");
        int islemler=input.nextInt();

        System.out.println("Birinci 'Tamsayı'yı giriniz");
     int  BirinciSayı = input.nextInt();
        System.out.println("ikinci 'Tam Sayı'yı  giriniz");
        int  ikinciSayı = input.nextInt();

        if (islemler<1||islemler>4){
            System.out.println("lütfen işlemler sekmesindeki seçiminizi doğru dürüst yapınız doğru seçiniz");}


         if (islemler==1){
             System.out.println("toplamı  ="+(BirinciSayı+ikinciSayı) );}

        if (islemler==2){
            System.out.println("Farkı  ="+(BirinciSayı-ikinciSayı) );}

        if (islemler==3){
            System.out.println("Carpimi  ="+(BirinciSayı*ikinciSayı) );}

        if (islemler==4){if(ikinciSayı!=0)
            System.out.println("bölme  ="+ (BirinciSayı/ikinciSayı));}


    if (islemler==4){if (ikinciSayı==0) System.out.println("Saçmalamayın hiçbir sayı '0' a bölünmez");}






    }}







