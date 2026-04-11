package CoreJava;
class Insertion{
    public static void main(String args[]){
        int nums [] = {2, 4, 6, 7, 7, 0};
        int pos = 2;
        int numToInsert = 31;

        for (int i=nums.length -1; i>pos; i--){
            nums[i] = nums[i-1];
        }
        nums[pos] = numToInsert;

        for(int j=0; j<nums.length; j++){
            System.out.print(nums[j] + " ");
        }
    }
}