package Day12ForloopWhileloop;

import java.util.Scanner;

public class Forloop04 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("başlangıç ve bitiş değerini veriniz");

        int start=input.nextInt();
        int end=input.nextInt();

      if (start>end){
          System.out.println("başlangız değeri  küçük olmalı");} else
                  for (int i=start;i<=end;i++){if (i%2==0){
            System.out.print(i + " ");}}



    }
}
