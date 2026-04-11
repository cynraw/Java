package CoreJava;
class StrMethods{
    public static void main(String args[]){
        String s1 = "chep";
        String s2 = "Ronoh";
        String s4 = "Hi, banana, mango, orange, pineapple";
        int len = s1.length();

        String s3 = s1.concat(s2);
        System.out.println(s3);

        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        String subString = s1.substring(2);
        System.out.println(subString);

        String replaced = s2.replace('n', 'l');
        System.out.println(replaced);

        String parts[] = s4.split(",");
        for(String s : parts){
            System.out.println(s); 
        }

        int result = s1.compareTo(s2);
        System.out.println(result);

        String interned = s1.intern();
        System.out.println(interned);
        

    }
}