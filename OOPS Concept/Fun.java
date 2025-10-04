public class Fun{
    void Greetings() {
        System.out.println("Vanakam da maple");
        Dummy();
    }
    void Dummy(){
        System.out.println("Na tha Dummy");
        
    }
    public static void main(String[] args){
        Fun obj = new Fun();
        obj.Greetings();
    }
}