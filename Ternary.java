import java.util.Scanner;
class Ternary {
    public static void main(String[] args) {
        /*if(true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(true? "Yes" : "No");*/
        boolean rain = true;
        String message = rain ? "Take an umbrella" : "Don't take an umbrella";
        System.out.println(message);

        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println(a>b ? "A is Big" : "B is Big");

    }
}