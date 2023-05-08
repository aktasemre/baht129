package Calısmalarrım;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetotOlustur {

public static boolean asalmi(int x){
    int counter=0;
    boolean asal=false;
    for (int i = 2; i <x ; i++) {
        if (x%i==0){
            counter++;
        }
       asal = counter==0;
    }

return asal;}

    public static void dr(String dr) {
       Scanner input=new Scanner(System.in);
        String drekle = null;
        List<String> Doktorİsim = new ArrayList<>();

        do {
            System.out.println("lütfen doktor ekleyin");
            drekle = input.nextLine();
            if (!drekle.equalsIgnoreCase("q")) {

                Doktorİsim.add(drekle);
            }

        }while (!drekle.equalsIgnoreCase("q"));
        System.out.println(Doktorİsim);
    }

    public static void drtc(int tc) {
        Scanner input = new Scanner(System.in);
        List<Integer> Doktortc = new ArrayList<>();


        int drekletc;
        do {
            System.out.println("lütfen doktorun tcsini ekleyin");
            drekletc = input.nextInt();
            if (drekletc!=0) {

                Doktortc.add(drekletc);
            }

        } while (drekletc != 0);
        System.out.println(Doktortc);

    }

}
