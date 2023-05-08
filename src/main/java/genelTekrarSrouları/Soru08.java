package genelTekrarSrouları;

import java.util.Scanner;

public class Soru08 {

   /* 8----
    Girilen String değerde tersten yazan Java kodunu yazınız.
            ​
    Test Data:
    java
            avaj
    ************************************************************************
            9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
            ​
    Test Data:
    str1: Java is
    str2: fun
​
    Beklenen Çıktı:
    java is fun
    ************************************************************************/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir kelime sayi giriniz:");
        String kelime = input.nextLine();

        kelime=kelime.trim();

        for (int i=kelime.length()-1;i>=0;i--){
            char a=kelime.charAt(i);
           System.out.print(a);
        }
        System.out.println();
        System.out.println("******************************************");
        System.out.print("Lutfen uçuca eklenecek 1. kelime'yi sayi giriniz:");
        String kelime1 = input.nextLine();
        System.out.print("Lutfen uçuca eklenecek 2. kelime'yi sayi giriniz:");
        String kelime2 = input.nextLine();
        kelime1=kelime1.trim();
        kelime2=kelime2.trim();

        System.out.println(kelime1+" "+kelime2);
    }
}
