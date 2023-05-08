package day16multidimensionalarrays;

public class md06 {
    public static void main(String[] args) {
        int a[][]={{2,4,5},{3,10},{4},{5,3}};

            int small=a[0][0],big=a[0][0];
        for (int[] w:a) {

            for (int k:w  ) {
                big=Math.max(big,k);

            small=Math.min(small,k);}


        }


        System.out.println(small+" "+big);




    }
}
