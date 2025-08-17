import java.util.Scanner;
class challenge2pt2las{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        

        if(salary >= 20000 || age < 25){
            System.out.println("Eligible for loan");
             System.out.println("Enter the loan amount:");
            int loan = sc.nextInt();
            if(loan < 50000){
                System.out.println("Loan approved");
            } else {
                System.out.println("Loan not approved");
            }
        } 
        
        else {
            System.out.println("No loan");
        }
}
}