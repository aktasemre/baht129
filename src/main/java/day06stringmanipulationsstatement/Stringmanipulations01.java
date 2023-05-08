package day06stringmanipulationsstatement;

import java.util.Scanner;

public class Stringmanipulations01 {
    public static void main(String[] args) {

        String s="     Ali Can  ";
        String sTrims=s.trim();
        System.out.println(s);
        System.out.println(sTrims);


        String tv="#459.99";
        String leptop="#459.989";

        String tv2=tv.replaceAll("#","");
        String leptop2=leptop.replaceAll("#","");

        System.out.println(tv2);
        System.out.println(leptop2);
        double a=(Double.valueOf(tv2)+ Double.valueOf(leptop2));
        System.out.println(a);



        String name="    ali cAn gül   ";
        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second=name.trim().toUpperCase().split(" ")[1].charAt(0);
        char tri=name.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" " +first+second+tri);

        String str= "";
        boolean str1=str.length()==0;
        System.out.println("String boş mu  " + str1);

        boolean str3=str.isEmpty();
        System.out.println(str3);


        String t="   ";
        boolean t2=t.replaceAll(" ","").length()==0;;
        System.out.println("sadece boşluktan mı oluşuyor  "+  t2);

        boolean t3=t.replaceAll(" ","").isEmpty();
        System.out.println(t3);
        boolean t4=t.isBlank();
        System.out.println("boşluk var mı  " +t4);



        String r="Java is eansy to learn";
        int a1=r.indexOf('a');
        System.out.println(a1);

        int i1=r.indexOf('i');
        System.out.println(i1);
        int e1=r.indexOf('e');
        System.out.println(e1);

        System.out.println("indexleri topla  "+(a1+i1+e1));


        String u="Ah Java sensiz olmaz Java";
        int u1=u.indexOf("Java");
        System.out.println("java kaçıncıda  "+u1);
        int u2=u.indexOf("Java");
        System.out.println(u2);

        String v=r;

        int v1=v.lastIndexOf('a');
        System.out.println(v1);

        int e2=v.lastIndexOf('e');
        System.out.println(e2+v1);




        int num=12;
        if (num>0){
            System.out.println("pozitif");}


        int number=50;
        if (number>-1&&number<10){
            System.out.println("rakam");}



        String k="abbbggkhk";
        char ch=k.charAt(0);

        if (k.lastIndexOf(ch)==k.indexOf(ch)){
            System.out.println(ch);}

        char ch2=k.charAt(1);

        if (k.lastIndexOf(ch2)==k.indexOf(ch2)){
            System.out.println(ch);}


        int C=-153;
          int  B=Math.abs(C);
        if (B>99&&B<1000){
            System.out.println("vaaaawww");}


    }


}
