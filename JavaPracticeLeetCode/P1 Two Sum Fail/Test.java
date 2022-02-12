public class Test extends TwoSum{
    public static void main(String[] args){
        int[] nums={3,3};
        TwoSum ts=new TwoSum();
        int[] result=ts.twoSum(nums,6);
        System.out.println(result[0]+", "+ result[1]);
    }
}