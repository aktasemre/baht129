package Day14arreysforeachioop;

import java.util.Arrays;

public class Arreya02 {
    public static void main(String[] args) {

        int a[]=new int[6];
        a[0]=33;
        a[1]=33;
        a[2]=165;
        a[3]=32;
        a[4]=78;
        a[5]=100;
      int  büyük=a[0];
        for (int i=0;i<6;i++){

           int k=a[i];

         if(büyük<a[i]){

             büyük=a[i];}
        }
        int  Kücük=a[0];
        for (int i=0;i<6;i++){

            int k=a[i];

            if(Kücük>a[i]){

                Kücük=a[i];}
        }System.out.println("En küçük:" +Kücük);
        System.out.println("En Büyük:" +büyük);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("küçük :" +a[0]+" Büyük :"+ a[a.length-1]);



int küç=0;
        int minimum=a[0];
        for (int w:a){
           küç= Math.min(minimum,w);

        }
        System.out.println(küç);


    }
}
