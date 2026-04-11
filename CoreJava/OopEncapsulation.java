package CoreJava;
class Human{
    private String name;
    private int age;

    public Human(String name){
        this.name = name;
        age = 18;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a < 18){
            System.out.println("Please provide a valid age");
            return;
        }
        age = a;
    }

    public int getAge(){
        return age;
    }
}

class OopEncapsulation{
    public static void main(String args[]){
        Human h1 = new Human("RONOH");
        h1.setAge(3);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}