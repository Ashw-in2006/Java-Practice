import java.util.Scanner;
class whileexample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i = i + 1;
        }
    }
}