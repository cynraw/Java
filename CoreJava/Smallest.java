package CoreJava;
class Smallest{
    public static void main(String args[]){
        int nums[] = {45, 22, 89, 16, 90, 33};

        int smallest = nums[0];
        int largest = nums[0];

        for(int n : nums){
            if(n<smallest){
                smallest = n;
            }else if(n>largest){
                largest = n;
            }
        }
        
        System.out.println("The smallest Element is :" + smallest);
        System.out.println("The smallest Element is :" + largest);
    }
}