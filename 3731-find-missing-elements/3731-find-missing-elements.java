class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            seen.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!seen.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}