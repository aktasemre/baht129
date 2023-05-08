package Day13WhileloopDowelileloop;

import java.util.Scanner;

public class Wiheloop01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Carpım tablosu için bir sayı giriniz");

        int num=input.nextInt();
        int i=1;
        while (i<11){
            System.out.println(num+ "x"+i+"="+(num*i));
        ;i++;}



       int k=0;
        System.out.println("Lütfen bir kelime giriniz");
        String word=input.next();
        String  newWörd="";

        while (k<word.length()){
            newWörd=newWörd+word.charAt(k)+"*";
            System.out.print(newWörd);k++;}







    }}
