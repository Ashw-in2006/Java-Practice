public class Mobile {
    void Iphone() {
        System.out.println("Iphone");
    }
    void Samsung() {
        System.out.println("Samsung");
    }
    void Oneplus() {
        System.out.println("Oneplus");
    }
    void Realme() {
        System.out.println("Realme");
    }
    
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.Iphone();
        obj.Samsung();
        obj.Oneplus();
        obj.Realme();
    }
}



class add  {
    int a,b;
    void Addition() {
         a =10;
         b =20;
    }
    void Sum() {
       Addition();
       int c = a + b;
       System.out.println(c);
    }
   

    public static void main(String[] args) {
     add  obj1 = new add ();
       
       obj1.Addition();
       obj1.Sum();
    }
}