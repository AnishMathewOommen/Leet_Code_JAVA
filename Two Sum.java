//Two Sum.java
//Question Number:1

class Solution {
    public int[] twoSum(int[] nums, int target) {

    int[] arr=new int[2];
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    
    for(int i=0;i<nums.length;i++)
    {
        if(map.containsKey(target-nums[i]))
        {
            arr[0]=map.get(target-nums[i]);
            arr[1]=i;
            return arr;
        }
        else
        {
            map.put(nums[i],i);
        }
    }
    return arr;
    }
}
