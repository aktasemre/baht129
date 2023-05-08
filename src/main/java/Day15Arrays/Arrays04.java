package Day15Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        int a[]={0,2,3,0,12,0,8};

        int num=0;
        int counter=0;


        for (int w:a ) {
            if (w==num) {
                counter++;
            }}

        if (counter>0){
            System.out.println(num+" array'de "+counter+" defa var");}else

        System.out.println(counter+"array de yok");




    }
}
