import java.util.Scanner;
class Challenge3
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(" number1:");
        int a = num.nextInt();
        System.out.println(" number2:");
        int b = num.nextInt();
        System.out.println(" number are:");
        int oddcount = 0;
        int evencount = 0;
        for(int i = a; i <=b; i= i+1 ){
            if(i % 2 == 0) {
                evencount = evencount + 1;
                System.out.println(i);
            }
            else {
                
                oddcount = oddcount +1;
               System.out.println(i );
                
            }
           
        }
        System.out.println(evencount+"Even");
       System.out.println(oddcount+"Odd");
        }
    }
