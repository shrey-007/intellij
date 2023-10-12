
public class Mian6 {
    static int removeElement(int[] nums, int val) {
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==val){
                int j=i+1;
                while(j<nums.length && nums[j]==val){j++;}
                if(j<nums.length){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;}}
            }

        for(i=0;i<nums.length;i++){
            if(nums[i]==val){break;}}

        System.out.println(i);
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(removeElement(arr,2));
    }
}
