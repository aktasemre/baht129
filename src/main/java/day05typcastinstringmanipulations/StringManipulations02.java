package day05typcastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s="Learn Java earn money";
        boolean isend=s.contentEquals("money");
        System.out.println(isend);
       String s1= s.replace("money","dollar");
        System.out.println(s1);
        String s2=s.replace("earn","dünya");
        System.out.println(s2);
        String s3=s.replace('a','*');
        System.out.println(s3);
        String s4=s.replace("n","xxx");
        System.out.println(s4);

        String s5=s.replace("e","");
        System.out.println(s5);

        String t="Ali 13 yasindadir";
        String t8="A";
        String t1=t.replaceAll("[0-9]","x");
        System.out.println(t1);
      String  t2= t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);
       String t3= t.replaceAll("[AEOÖUÜaeıioöuü]","?");
        System.out.println(t3);

        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        String t6= t.replaceAll("[^ ]","+");
        System.out.println(t6);

        String t7=t.replaceAll("[^aeıiyoöuü]","&");
        System.out.println(t7);

        String t9=t.replaceAll(t8,"emre");
        System.out.println(t9);


    }}
