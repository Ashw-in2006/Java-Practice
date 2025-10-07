import java.util.Arrays;
import java.util.Scanner;
class challenge3pt2la3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];

        for(int i = 0 ; i<=size-1 ; i=i+1){
            marks [i] = scan.nextInt();
        }

    }
} 

class MiddleElement{
    public static void main(String args[]){
        Scanner kuthi = new Scanner(System.in);
        System.out.println("How much element");
        int n = kuthi.nextInt();
        
        int[]element = new int[n];
        for(int i=0; i<=n-1; i=i+1){
            element[i] = kuthi.nextInt();
        }
        System.out.println("Fucking elements is");
        System.out.println(element[n/2]);


        
    }
}