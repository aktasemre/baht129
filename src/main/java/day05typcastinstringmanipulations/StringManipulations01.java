package day05typcastinstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "java is easy";

       String süpper= s.toUpperCase();
        System.out.println(s);
        System.out.println(süpper);
        String sLover=s.toLowerCase();
        System.out.println(sLover);

        char firstCar=s.charAt(0);
        System.out.println(firstCar);
        char SecontChar= s.charAt(1);
        char SecontLastChar= s.charAt(10);

        System.out.println(SecontChar);
        System.out.println(SecontLastChar);
        System.out.print(SecontChar);
        System.out.println(SecontLastChar);
        System.out.println(""+SecontChar+SecontLastChar);

       int sLent= s.length();
        System.out.println(sLent);

        String sub1=s.substring(0,4);
        System.out.println(sub1);


        String sub2=s.substring(5,7);
        System.out.println(sub2);
       String sub3= s.substring(8,12);
        System.out.println(sub3);

        String sub4=s.substring(8);
        System.out.println(sub4);

        boolean isExit=s.contains(" ");
        System.out.println(isExit);

       boolean isStart= s.startsWith("Java");
        System.out.println(isStart);





    }}
