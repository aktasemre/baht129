package Day10Swichloop;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        for (int i=21;i<160;i++){if (i%4==0 && i%6==0){
            System.out.print(i +" ");}}
        System.out.println();
        System.out.println("**************************************************************************");
        String a="bayburtlu";
        for (int i=0;i< a.length();i++){
            String ch=a.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());}}













    }}

