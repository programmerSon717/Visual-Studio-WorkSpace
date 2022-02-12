public class Test extends TwoSum{
    public static void main(String[] args){
        int[] nums={6,4,3,8,7,5,2};
        TwoSum ts=new TwoSum();
        int[] result=ts.twoSum(nums,5);
        System.out.println(result[0]+", "+ result[1]);
    }
}