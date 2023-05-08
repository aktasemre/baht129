package Day15Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {

        String arr[]={"Miceal","Ajda","Tomas","tom"};

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed());

        System.out.println(Arrays.toString(arr));

        String crr[]={"Miceal","Ajda","Tomas","tom","Ali","Emre"};


        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(crr));





    }
}
