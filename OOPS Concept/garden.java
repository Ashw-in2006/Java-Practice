public class garden {
    int apple_count , apple_price;
    void apple(){
        System.out.println(apple_count * apple_price);
    }
    public static void main(String[] args) {
        garden obj1 = new garden();
        obj1.apple_count = 5;
        obj1.apple_price = 20;
        obj1.apple();
    }
}