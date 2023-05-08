package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        ArrayList<Character> initials=new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('C');
        initials.add('D');


        int numOfElement= initials.size();

        System.out.println(numOfElement);
      char a= initials.get(1);
        System.out.println(a);



        List<Double> salary= new ArrayList<>();
        salary.add(190000.78);
        salary.add(13444.45);
        salary.add(35.45545);
        System.out.println(salary);

           int  idx=0;
        for ( Double w:salary ) {


            salary.set(idx,w*1.5);idx++;

        }

        System.out.println(salary);



    }
}
