package CoreJava;
class Mobile{
    String brand;
    int price;
    static String name = "Smartphone";     

    public Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

class OopStatic{
    public static void main(){
        Mobile mob1 = new Mobile("Apple", 15000);
        Mobile mob2 = new Mobile("Samsung", 17000);

        Mobile.name = "Phone";

        
        mob1.show();
        mob2.show();

        Mobile.show1(mob1);
    }

}