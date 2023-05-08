package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        int a[][]={{1,2,},{5,7,5},{4,6,88},{2,4},{99}};

        System.out.println(Arrays.deepToString(a));
           int sum=0;
           int counter=0;
        for (int[] w:a){

            sum=sum+w.length;
        }
        System.out.println(sum);










    }
}
