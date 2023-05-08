package Day14arreysforeachioop;

public class Arras04 {
    public static void main(String[] args) {
        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        for (String w:colors ) {
            if (w.equals("Yellow")){break;}{
                System.out.println(w);}}

        System.out.println("**************************");


        for(int i=colors.length-1;i>=0;i--){

        if(colors[i].equals("Yellow")){break;}
            System.out.println(colors[i]);}
        System.out.println("****************************");
            int contr=0;
        for (String w:colors  ) {
            if (w.equals("Yellow")){
            break;}
            contr++;}
        System.out.println(contr);
        for (int i=contr+1;i<=colors.length;i++){
            System.out.println(colors[i]);}
        System.out.println("*************************");











    }}
