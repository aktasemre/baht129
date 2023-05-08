package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        int a[][]= new int[3][2];
        a[0][0]=5;
        a[0][1]=45;
        a[1][0]=15;
        a[1][1]=2;
        a[2][0]=1;
        a[2][1]=6;
        System.out.println(Arrays.deepToString(a));

        System.out.println(Arrays.toString(a[2]));
        System.out.println((a[1][1]));



    }
}
