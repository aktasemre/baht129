package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {
        int a[][]={{2,4,5},{3,4},{4},{5,3}};
            int carp=1;

        for (int[] w:a) {

            for (int  k:w  ) {
                carp=carp*k;

            }

        }


        System.out.println(carp);



    }
}
