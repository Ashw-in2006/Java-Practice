import java.util.Scanner;
class challenge3la5{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = num.nextInt();
        int a = 3;
        int b = 5;
        int count = 0;
        System.out.println("Numbers divisible by both 3 and 5 from " + number + " to 100 are:");
        for(int i = number; i<=100; i++){
           
        if(i%a== 0 && i%b == 0){
            
            System.out.println(i);
            count = count + 1;
        } 
    }
        System.out.println("Count of the numbers:" +count);     
}
}
