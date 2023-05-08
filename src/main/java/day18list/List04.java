package day18list;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {

        List<String> names= new ArrayList<>();
        List<String> males= new ArrayList<>();
        males.add("Emare");
        males.add("emre");

        names.add("Emare");
        names.add("Elif");
        names.add("Zehra");
        names.add("Rabia");
        names.add("Fatma");
        names.add("Gökçe");


       boolean r=names.containsAll(males);
        System.out.println(r);

        List<String> sub= new ArrayList<>();
        System.out.println( names.subList(0,3));


        names.retainAll(males);

        System.out.println(names);
        System.out.println(males);



    }}
