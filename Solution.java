class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odds = new int[nums.length];
        int[] evens = new int[nums.length];
        int oddL = 0;
        int evenL = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evens[evenL] = nums[i];
                evenL++;
            }
            else{
                odds[oddL] = nums[i];
                oddL++;
            }
        }

        int[] ret = new int[oddL + evenL];

        boolean x = true;

        for(int i = 0; i < ret.length; i++){
            if(x){
                ret[i] = evens[i / 2];
                x = false;
            }
            else{
                ret[i] = odds[i / 2];
                x = true;
            }
        }

        return(ret);
    }
}
