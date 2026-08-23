class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for( int num:nums){
            set.add(num);
        }
        int count=1;
        int max=0;
        
        int i=set.first();
        for(int num:set){
            int j=num;
            if(j-i==1){
                count++;
            }else{
                if(count>max){
                    max=count;
                    count=1;
                }else{
                    count=1;
                }
            }
            i=j;
        }
        return Math.max(max,count);
    }
}
