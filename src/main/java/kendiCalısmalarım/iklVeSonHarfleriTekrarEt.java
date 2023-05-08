package kendiCalısmalarım;

import java.util.Scanner;

public class iklVeSonHarfleriTekrarEt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen birşeyler yazın");
        String kelime= input.nextLine();
        kelime=kelime.trim();
        char A1=kelime.charAt(0);
        System.out.println(""+A1 +A1 );

        int A2=kelime.length();
       char A3= kelime.charAt(A2-1);
        System.out.println((""+A1+A1)+""+A3+A3);










    }
}
