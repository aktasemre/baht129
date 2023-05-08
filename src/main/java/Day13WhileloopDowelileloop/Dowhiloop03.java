package Day13WhileloopDowelileloop;

import java.util.Scanner;

public class Dowhiloop03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int conter=0;

        do {
            if (conter==4){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }

            System.out.println("lütfen Usernem'inizi giriniz");
            String username=input.next();

            System.out.println("lütfen Paswword'inizi giriniz");
            String psw=input.next();


            if (username.equals("admin")&&psw.equals("pwd123")){
                System.out.println("Hesabınıza hoş geldiniz"); break;}

            conter++;
        }while (true);





    }
}
