import java.util.Arrays;
import java.util.Scanner;
class array {
    public static void main(String[] args){
       /* String[] playlist = new String[3];
        playlist[0] = "Song A";
        playlist[1] = "Song B";
        playlist[2] = "Song C";*/
        //String[] playlist = {"Song A", "Song B", "Song C"};
        //int [] num = {1, 2, 3, 4, 5};
        //System.out.println("Sum of array: " + Arrays.stream(num).sum());
        int [] score = new int[5];
        Scanner scan = new Scanner(System.in);

        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();      
        score[3] = scan.nextInt();
        score[4] = scan.nextInt();
        
        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
        
    }
}