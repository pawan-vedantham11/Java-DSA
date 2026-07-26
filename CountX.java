public class CountX {
    public static void main(String[] args) {
        int[] nums={0,0,3,4,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums){
        int start=0;
        int end=nums.length;
        while(start<=end){
            int x =start+(end-start)/2;
            int count=0;
            for(int num:nums){
                if(num>=x){
                    count++;
                }


            }
            if(count==x){
                return x;

            }
            if(count<x){
                start=x+1;
            }
            else{
                end=x-1;

            }
        }
        return -1;
    }
}
