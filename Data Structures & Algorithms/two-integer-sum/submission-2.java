class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            int b=target-nums[i];
            if(m.containsKey(b))
            {
                return new int[]{m.get(b),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}
