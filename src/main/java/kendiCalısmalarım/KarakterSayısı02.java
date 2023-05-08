package kendiCalısmalarım;

import java.util.Scanner;

public class KarakterSayısı02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ch=input.next();

        for (int i=0;i<ch.length();i++){
            int countri=0;
            for (int k=0;k<ch.length();k++){
            if (ch.charAt(i)==ch.charAt(k)){
                countri=countri+1;}
                }System.out.print(ch.charAt(i)+":"+countri + " ");}







        }



    }
