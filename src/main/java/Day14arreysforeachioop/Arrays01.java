package Day14arreysforeachioop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String karTop[]=new String[5];
        karTop[1]="Emre";
        karTop[2]="Elif";
        karTop[3] ="Fatma Zehra";
        karTop[4]="Rabia Gökce";
        karTop[0]="kb";
        System.out.println(Arrays.toString(karTop));

        System.out.println(karTop[0].length()+karTop[karTop.length-1].length());

       int top=0;

        for (int i=0;i< karTop.length;i++){

            String to[]=new String[5];
            to[0]="Emre";
            to[1]="Elif";
            to[2] ="Zehra";
            to[3]="Gökce";
            to[4]="";
        top=top+to[i].length();}
        System.out.println(top);
    int sum=0;
    for (String w:karTop){
        sum=sum+w.length();
    }
        System.out.println(sum);
    }
}
