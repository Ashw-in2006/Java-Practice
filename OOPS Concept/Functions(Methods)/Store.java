public class Store {

    void soap(int money){
         System.out.println("Soap purchaced for " +money);
         }
    void chocolate(int money){
         System.out.println("Chocolate purchaced for " +money);
         }
    void icecream(int money){
         System.out.println("Icecream purchaced for " +money);
         }


    public static void main(String[] args) {
       Store obj = new Store();
         obj.soap(50);
         obj.chocolate(100);
         obj.icecream(200);
}
}

class sum{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        sum obj = new sum();
        obj.add(10,20);
        obj.sub(20,10);
        obj.mul(10,20);
        obj.div(20,10);
    }
}