class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 3)
        {
            return new ArrayList<>();
        }

        HashSet<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length; i++)
        {
            int initial = i;

            int left = i + 1;

            int right = nums.length - 1;

            while(left < right) 
            {
                int sum = nums[initial] + nums[left] + nums[right];

                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[initial],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum < 0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }

           
        }
         return new ArrayList<>(result);
        
    }
}