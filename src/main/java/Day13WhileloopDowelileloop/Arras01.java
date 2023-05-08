package Day13WhileloopDowelileloop;

import java.util.Arrays;

public class Arras01 {
    public static void main(String[] args) {

        String stdMane[]=new String[5];

    stdMane[2]="Ajdar";
    stdMane[0]="cüneyt";
        stdMane[1]="Kemal";
        stdMane[3]="Ezel";
        stdMane[4]="Beşir";

        System.out.println(Arrays.toString(stdMane));
        System.out.println(stdMane[2]);
        for (int i=0;i<stdMane.length;i++){
            System.out.print(stdMane[i]+"!"+" ");}


    }
}
