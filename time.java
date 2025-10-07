
import java.util.Scanner;
class time{
public static void main(String[] args)// block 
{
    // java is a collection of class(10,000) , combination of function class. 
    //connect a link may be direct or indirect.
    //non static - instance
    // Method or function (action oriented) print also method, 
    // class Integer
    // primitive already declered.(memory reserved)
    // non- primitive 
    // array - get a allocated space for a particulars.
    //<datatype> <var_name>[];
    //<datatype>[] <var
    // int x[] = new int(4bites)[]{1,2,3,4,5}; // only done in decleration.
    // int x[] = new int[]{1,2,3,4,5};
    // x[0] = 1; this is possible
    // length of x ... x.length;
    //byte b = 127;
    //System.out.println(b);
    
    //int c = name.nextInt();
    //int b = a1 + a2;
    //int avg = b/2;
    //String str1 = name.nextLine();
    //System.out.println("sum" +b);
    //System.out.println("Avg" +avg);
    //int middle;
   //if ((a > b && a < c) || (a < b && a > c)) {
     //       middle = a;
       // } else if ((b > a && b < c) || (b < a && b > c)) {
          //  middle = b;
        //} else {
            //middle = c;
        //}

        //System.out.println("The middle number is: " + middle);
      //Scanner sc = new Scanner(System.in);

        //int evenCount = 0, oddCount = 0;

        //for (int i = 1; i <= 5; i++) {
          //  System.out.print("Enter number " + i + ": ");
            //int num = sc.nextInt();

            //if (num % 2 == 0) {
              //  System.out.println(num + " is Even");
                //evenCount++;
            //} else {
              //  System.out.println(num + " is Odd");
                //oddCount++;
            //}
        //}

        //System.out.println("Total Even numbers: " + evenCount);
        //System.out.println("Total Odd numbers: " + oddCount);

        
       // Scanner sc = new Scanner(System.in);

        // Input two numbers
        //System.out.print("Enter first number: ");
        //int a = sc.nextInt();
        //System.out.print("Enter second number: ");
        //int b = sc.nextInt();

        //System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping without a temp variable
        //a = a + b; // sum stored in a
        //b = a - b; // original a stored in b
        //a = a - b; // original b stored in a

        //System.out.println("After swap: a = " + a + ", b = " + b);

        //sc.close();
    
    //Scanner sc = new Scanner(System.in);

      //  System.out.print("Enter a: ");
        //int a = sc.nextInt();
        //System.out.print("Enter b: ");
        //int b = sc.nextInt();
        //System.out.print("Enter c: ");
        //int c = sc.nextInt();

        //System.out.println("Before shift: a = " + a + ", b = " + b + ", c = " + c);

        // Shift without extra variable
        //a = a + b + c; // total sum in a
        //b = a - (b + c); // old a → b
        //c = a - (b + c); // old b → c
        //a = a - (b + c); // old c → a

        //System.out.println("After shift: a = " + a + ", b = " + b + ", c = " + c);

        //sc.close();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int middle;

        if ((a > b && a < c) || (a > c && a < b)) {
            middle = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("The middle number is: " + middle);

        sc.close();
    }
}


