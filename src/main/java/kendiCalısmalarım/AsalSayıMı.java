package kendiCalısmalarım;

import java.util.Scanner;

public class AsalSayıMı {
    public static void main(String[] args) {
        System.out.println("lütfen bir tam sayı giriniz");
        Scanner input=new Scanner(System.in);
       int n=input.nextInt();

       int i=2;

        for(int k=2;k<n;k++){

            while (i<n){
           if (n%i==0){
               System.out.println("asal değil");break;}else {i++;}
           ;}
      }}}