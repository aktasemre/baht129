package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        int a[][]={{1,2,6},{5,7,5},{4,6,88},{2,4},{99}};
            int sum=0,idx=0;

        for (int[]  w:a) {
            System.out.println(Arrays.toString(w));}


        for (int[] k:a) {
            sum=sum+k.length;}

        int b[]=new int[sum];

        for (int[] t:a){

            for ( int k:t ) {
                b[idx]=k;
                idx++;

            }


        }

        System.out.println(Arrays.toString(b));
    }
}
