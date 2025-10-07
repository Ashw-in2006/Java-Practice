import java.util.Scanner;
public class School {
    String Passorfail(int Score){
        if(Score>40){return "pass";}
        else {return "Fail";}
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalmark = sc.nextInt();
        School obj = new School();
        String result = obj.Passorfail(totalmark);
        System.out.println(result);
    }
}