package CoreJava;
class StrBuffer{
    public static void main(String args[]){
        String s = new String("Ronoh");
        StringBuffer sb = new StringBuffer("Cheptanui");
        System.out.println("Capacity sb:" + sb.capacity());
        System.out.println("Length sb:" + sb.length());
        // System.out.println("Capacity s:" + s.capacity());
        System.out.println("Length s:" + s.length());
    }
}