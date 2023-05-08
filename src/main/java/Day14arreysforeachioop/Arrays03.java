package Day14arreysforeachioop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        String colors[] = new String[5];
        colors[1] = "Emre";
        colors[2] = "Elighghgghf";
        colors[3] = "Zehra";
        colors[4] = "Rabia Gökce";
        colors[0] = "kb";
        System.out.println(Arrays.toString(colors));
        int countre = 0;
        for (String w : colors) {
            if (w.length() <6) {
                countre++;}
        }

        System.out.println(countre);

        String yeniArrey[]=new String[countre];
        int inx=0;
        for (String w:colors) {
            if(w.length()<6){
                yeniArrey[inx]=w;
            inx++;}

        }
        System.out.println(Arrays.toString(yeniArrey));

        }
    }
