import java.util.*;
public class Find {
    int oddeven(int a){
        if(a%2==0){
            System.out.println("Even "+a);
            return 0;
        }
        else{
            System.out.println("Odd "+a);
            return 1;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       Find obj = new Find();
       obj.oddeven(num);
       
    }
}
