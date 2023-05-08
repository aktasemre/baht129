package day18list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        List<Integer> en=new ArrayList<>();

        List<Integer> num=new ArrayList<>();

        en.add(12);
        en.add(26);
        en.add(11);
        en.add(7);
        en.add(7);
        en.add(1);
        en.add(13);
        en.add(2);
        en.add(13);
        System.out.println(en);
int i=0;
        for (Integer w:en    ) {

            if (en.get(i)!=7){
                num.add( en.get(i)+3);
            }else {num.add(en.get(i));}
            i++;
        }

        System.out.println(num);

        for (Integer t:en ) {

            if (t == 7) {
                continue;
            }
            en.set(en.indexOf(t), t + 3);
        }
        System.out.println(en);


    }
}
