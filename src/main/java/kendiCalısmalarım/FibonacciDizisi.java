package kendiCalısmalarım;

import java.util.Scanner;

public class FibonacciDizisi {
    public static void main(String[] args) {

        //  Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        // 0-1-1-2-3-5-8-13-21-34..

        System.out.println("lütfen bir tamsayı giriniz");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int i1=1;
        int i2=1;
        int i3=1;
        int i=0;

        System.out.print(0+" "+1+" ");

        while (i<a&&i3<a){
            System.out.print(i3+ " ");
            i3=i1+i2;
            i1=i2;
            i2=i3;i++;}}}
