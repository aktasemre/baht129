package Day15Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");
        int sayı=input.nextInt();
        String stdNames[]=new String[sayı];


        for (int i=1;i<=sayı;i++){

            System.out.println("lütfen "+i+"."+"öğrencinin  adını giriniz");
            String sdtName=input.next();
            System.out.println("Girişi sonlandırmak için Q ya basınız");
            if (sdtName.equalsIgnoreCase("Q")){break;}

            stdNames[i-1]=sdtName;}
        System.out.println(Arrays.toString(stdNames));

    }}
