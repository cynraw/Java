package CoreJava;
class Calc2{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCalc2 extends Calc2
{
    public int multy(int n1, int n2){
        return n1 * n2;
    }

    public int div(int n1, int n2){
        return n1 / n2;
    }
}

class VeryAdvCalc2 extends AdvCalc2
{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

class OopMultiLevelInheritance{
    public static void main(String args[]){
        VeryAdvCalc2 obj1 = new VeryAdvCalc2();
        int r1 = obj1.add(10, 9);
        int r2 = obj1.sub(80, 19);
        int r3 = obj1.multy(70, 8);
        int r4 = obj1.div(80, 20);
        double r5 = obj1.power(4, 2);

        System.out.println(r1 + " " + r2 + " " + r3 +" "+r4+" "+r5);
    }
}

