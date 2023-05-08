package day18list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        List<Integer> en=new ArrayList<>();

        en.add(12);
        en.add(26);
        en.add(11);
        en.add(129);
        en.add(1);
        en.add(13);
        en.add(2);
        System.out.println(en);
        Collections.sort(en);

        System.out.println(en);

        int minDiff=en.get(1)-en.get(0);

        for (int i=1;i<en.size();i++) {

            minDiff = Math.min(minDiff, en.get(i) - en.get(i - 1));
        }
        System.out.println(minDiff);


     for (int i=1;i< en.size();i++){

         if (minDiff== (en.get(i)- en.get(i-1))){
             System.out.println(en.get(i)+","+ en.get(i-1));}

     }




        }

    }
