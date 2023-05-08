package Day15Arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int idx=0;
        int a[]={0,2,3,0,12,0,8};
        int b[]=new int[a.length];

        for (int w:a ) {

            if ( w!=0){b[idx]=w;

                    idx++;}

        }


        System.out.println(Arrays.toString(b));


    }
}
