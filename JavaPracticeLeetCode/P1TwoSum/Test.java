import java.util.*;
class Soliution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //copy data set and past in HashTaple : map.put(nums[i],i);
        //map.put(key,value)
        for(int i =0; i<nums.length; i++) map.put(nums[i],i);
        for(int i1=0; i1<nums.length; i1++){
            Integer i2=map.get(target-nums[i1]);
            if(i2!=null && i1!=i2) return new int[]{i1,i2};
        }
        throw new IllegalArgumentException("No two sum Soliution");
    }
}

/* Efficient Code in below
import java.util.*;
class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
                
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/


//When you are in the Leetcode to submit, delete below
public class Test{
    public static void main(String[] args){
        int[] nums={6,4,3,8,7,5,2};
        TSSolution sol=new TSSolution();
        int[] result=sol.twoSum(nums, 5);
        System.out.println(result[0]+", "+result[1]);
    }
}

