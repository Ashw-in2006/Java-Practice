
import java.util.Random;

class wh{
    public static void main(String args[]){
        //int i = 1;
        //while(i<=10){
        //    System.out.println(i);
        //    i=i+1;

        Random rand = new Random();
        int n = 0;
        while (n != 5) { 
             n = rand.nextInt(11);
            System.out.println(n);
        }
        
        }
    }
