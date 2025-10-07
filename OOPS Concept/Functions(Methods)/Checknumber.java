import java.util.Scanner;
public class Checknumber {
    String number(int num){                 // String function with parameter int
        if(num==0) {return "Zero";}         // input checking
        else if(num > 0) {return "positive";}
        else {return "Negative"; }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               // get input 
        Checknumber obj = new Checknumber();        // obj created
        String sum =obj.number(n);                  //input going up
        System.out.println(sum);                    //result
    }
}

class Maximum {
    String max(int a, int b){
        if(a>b) {return "A is Maximum";}
        else {return "B is Maximum";}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Maximum obj = new Maximum();
        String D =obj.max(x,y);
        System.out.println(D);
    }
}