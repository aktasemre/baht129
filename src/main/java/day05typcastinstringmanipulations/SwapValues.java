package day05typcastinstringmanipulations;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen A sayısını giriniz");
        int a= input.nextInt();

        Scanner inputn=new Scanner(System.in);
        System.out.println("Lütfen B sayısını giriniz");
        int b= inputn.nextInt();


        System.out.println("a= "+a);
        System.out.println("b= "+b);
    int temp=0;
    temp=a;
    a=b;
    b=temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    int x=12;
    int y=5;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    x=x+y;
    y=x-y;
    x=x-y;
        System.out.println("x= "+x);
        System.out.println("y= "+y);



    }}
