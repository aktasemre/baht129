package Day15Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String s="java brings you maney";

       int  vowes= s.replaceAll("[^aeıioöuüAEIİOÖUÜ]","").length();

        System.out.println(vowes);


       String letters[]=s.toLowerCase().split("");
        System.out.println(Arrays.toString(letters));
        int counter=0;

        for (String w:letters) {

            switch (w){

                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                case "ı" :
                case "ö":
                case "ü":
                    counter++;
            }






        }
        System.out.println(counter);


    }
}
