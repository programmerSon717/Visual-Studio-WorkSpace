


//Using the HashTable, search time can be reduced more efficiently. 
//Since the search time for the HashTable is O(n), the value can be found by searching only once. 

/*
Key: 6 4 3 8 7 5 2
Val: 0 1 2 3 4 5 6

5-6=-1? 
-1 is not in the key
5-4=1?
1 is not in the key
5-3=2?
2 is in the key (index of 2 is 6)
return [2,6]

//sudo
for(increment index)
Target - nums[i]=ans 
ans is in the key? 
yes? 
-> get the nums[i] and ans's index
-> return[key, val]
no?
-> keep researching
*/

import java.util.*;
import java.util.HashMap;
class TwoSum{
    public int[] twoSum(int[] nums, int target){

        //initialize Hashmap
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();

        //copy the array into the HashTable
        //rotate the data in the array once and store them all in the HashTable with the value in the array as the key and index as the value. 
        for(int i=0; i<nums.length; i++) map.put(nums[i],i);

        //You can search from the beginning of the array and find the value obtained by subtracting the current value from the target from the HashTable. 
        for(int i1=0; i1<nums.length; i1++){

            //if you find key B when you subtract key A from the target 
            //consider the sudo code above 
            //If you find the key in the HashTable key data, store it in i2 which is initiallized in below
            Integer i2=map.get(target-nums[i1]);

            //null means there are no keys in the HashTable
            //I1, I2 should not be same(Read the Condition of this problem)
            if(i2!=null && i1!=i2) {

                //make this index to array and return
                return new int[]{i1,i2};
            }
            throw new IllegalArgumentException("No two sum solution in here");            
        }
        return nums;
    }       
}


