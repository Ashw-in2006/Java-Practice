import java.util.Scanner;
class challenge2 {
    public static void main(String[] arg){
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m1 = mark.nextInt();
        if(m1 > 35){
            System.out.println("You have passed the exam");
        } else {
            System.out.println("You have failed the exam");
        }
        }
    }

class challengeincome{
    public static void main(String[] args) {
        Scanner income = new Scanner(System.in);
        System.out.println("Enter your monthly income:");
        int variable = income.nextInt();
        if(variable>7000){
            System.out.println("You are eligible for a Scholarship");
        } else {
            System.out.println("You are not eligible for a Scholarship");
        } 
}
}

class challengedivisible{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = num.nextInt();
        if(number % 5 == 0 && number % 3 == 0) {
            System.out.println("The number is divisible by 5 & 3");
        } else {
            System.out.println("The number is not divisible by 5 & 3");
        }
    }
}