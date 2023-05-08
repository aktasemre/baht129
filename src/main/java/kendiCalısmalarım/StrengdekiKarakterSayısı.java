package kendiCalısmalarım;

import java.util.Scanner;

public class StrengdekiKarakterSayısı {
    public static void main(String[] args) {

   Scanner input=new Scanner(System.in);
        System.out.println("lütfen karakter giriniz" );

        String A= input.nextLine();
        String B=A.replaceAll("[^a]","");
        System.out.println("a="+ B.length());


    }}
