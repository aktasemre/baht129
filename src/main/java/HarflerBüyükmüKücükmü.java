import java.util.Scanner;

public class HarflerBüyükmüKücükmü {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen kelime giriniz");

        String emr1 = input.nextLine();
       String emre=emr1.replaceAll("[^a-z^A-Z]","");

 String B=emre.replaceAll("[^A-Z]","");
 if (emre.length()==B.length()){
     System.out.println("Bütün harfler büyük");}
 String C=emre.replaceAll("[^a-z]","");
 if (emre.length()==C.length()){
     System.out.println("Bütün harflerr küçük");}

if (emre.length()!=B.length()&&emre.length()!=C.length())
{
    System.out.println("Büyük ve Küçük harfler içermektedir");}


        System.out.println(B);
        System.out.println(C);


    }}