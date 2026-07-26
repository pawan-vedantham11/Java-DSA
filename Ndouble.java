
import java.util.Arrays;
public class Ndouble {
    public static void main(String[]args){
     int []arr={10,2,5,3};
     System.out.println(checkIfExists(arr));
    }
    public static boolean checkIfExists(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int target=arr[i]*2;
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid==target&&mid!=1){
                    return true;
                }
                if(mid<target){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }

            }
            
        }   
        return false;
    }


    
}
