package Day11ForLop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Forloop05 {
    public static void main(String[] args) {
        for (int i=1;i<4;i++){
            System.out.println("week:"+i);
            for (int k=1;k<4;k++){

            System.out.println("day:"+k);}
            System.out.println("............");}
        System.out.println();

 int x=6,y=5;
        System.out.println(Long.MAX_VALUE);
        System.out.println('b');
        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());
        System.out.println(2+3*(4+5));


        String b = "Al! 12 ?_";

                 System.out.println(b.replaceAll("\\A", "*"));


        String str = "Java";
        System.out.println(str.replace("", "/"));


        int a=3;
        int t=4;

        int f=4, g=6;

        int arr[] = new int[4];

        arr[0]=4;
        arr[2]=5;

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> brr = new ArrayList<>();

        brr.add(4);


        brr.get(0);

    }
}