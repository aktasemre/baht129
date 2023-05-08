package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        int a[][]={{1,2,6},{5,7,5},{4,6,88},{2,4},{99}};
        int sum=0;
        for (int[] w:a) {

            for (int k:w){

                sum=sum+k;
            }


        }

        System.out.println(sum);

    }
}
