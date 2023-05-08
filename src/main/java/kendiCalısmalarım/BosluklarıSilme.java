package kendiCalısmalarım;

import java.util.Scanner;

public class BosluklarıSilme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("cümle giriniz" );

        String a= input.nextLine();

        String s1=a.replaceAll("[ ]","");
        System.out.println(s1);

        String s2=a.replaceAll("[aeıioöuü]"," ");
        System.out.println(s2);








    }






}
