import java.util.Scanner;
class challenge2pt2 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Enter a number:");
        int s1 = score.nextInt();
        if(s1 < 50){
            System.out.println("You need to improve");
        }
        else if(s1 >= 50 && s1 < 70){
            System.out.println("You are doing well");
        }
        else if(s1 >= 70){
            System.out.println("Excellent work");
        }
    }
}

class challenge2pt2mark{
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int m1 = mark.nextInt();
        int m2 = mark.nextInt();
        int m3 = mark.nextInt();
        int m4 = mark.nextInt();
        int m5 = mark.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        if(average < 35){
            System.out.println("Additional class is required");
        }
        else {
            System.out.println("good to go");
        }
}
}

class challenge2pt2traffic{
    public static void main(String[] args) {
        Scanner traffic = new Scanner(System.in);
        System.out.println("Enter the traffic signal color (red, yellow, green):");
        String color = traffic.nextLine();
        if(color.equalsIgnoreCase("red")){
            System.out.println("Stop");
        }
        else if(color.equalsIgnoreCase("yellow")){
            System.out.println("Get ready to stop");
        }
        else if(color.equalsIgnoreCase("green")){
            System.out.println("Go");
        }
        else {
            System.out.println("Invalid color");
        }
    }
}

