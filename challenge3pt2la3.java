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

/*import java.util.Scanner;
class q4{
    public static void main(String arg [])
    {
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int[] marks = new int[size];

for(int i=0;i<=size-1;i=i+1)
{
    marks[i] = scan.nextInt();
}
    System.out.print("The Middle element in the array is:");
    System.out.print(marks[size/2]);
}
}*/