import java.util.Scanner;
class doo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = 0; 
        do { 
            System.out.println("enter a number");
            a = scan.nextInt();
            //a = a + 1;
        } while (a <= 10);
    }

}