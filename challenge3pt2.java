import java.util.Arrays;

import java.util.Scanner;
class challenge3pt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int [] table = new int[11];
        for (int i = 1; i <= 10; i = i + 1) {
            table[i] = scan.nextInt();
            
        }
        System.out.println("Two multiplication Table ");

        for (int i = 1; i <= 10; i = i + 1){
        table[i] = table[i] * 2;
        System.out.println(i+ "x2="+table[i]);
        }
    
    }

}