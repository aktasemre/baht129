package day18list;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Integer> ages= new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);ages.add(12);ages.add(12);ages.add(12);
        ages.add(8);
        ages.add(40);
        System.out.println(ages);
        Integer nanPrimitivw=12;
        ages.remove(nanPrimitivw);
        System.out.println(ages);

        List<Integer> silinecekler=new ArrayList<>();
        silinecekler.add(12);
            ages.removeAll(silinecekler);
        System.out.println(ages);









    }}
