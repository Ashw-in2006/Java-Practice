public class Laptop{
    String name = "";
    String brand = "";
    int price = 0;
    int ram = 0;

    public static void main(String[] args){
        Laptop Lap = new Laptop();
        Lap.name = "Inspiron 15";
        Lap.brand = "Dell";
        Lap.price = 60000;
        Lap.ram = 8;

        Laptop Lap2 = new Laptop();
        Lap2.name = "Pavilion";
        Lap2.brand = "HP";
        Lap2.price = 70000;
        Lap2.ram = 16;

        System.out.println(Lap.name);
    }
}