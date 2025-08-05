//My Profile :  https://leetcode.com/u/Ramadeepthi/
//Problem :Maximum Subarray 
//Leetcode Link : https://leetcode.com/problems/maximum-subarray/description/

/*Approach
  -Take current sum is 0 and max sum to first element in array of nums
  -than add every adjacent elements and check if it is less than 0 if yes then set to 0
  -if no then again add emeents and compare to max elements if cursum is high than oldmax then assign as new max
  -then return maxsum*/

/*Time Complexity : O(n)
  Space Complexity : O(1)*/

//code
class Solution {
    public int maxSubArray(int[] nums) {
        int curSum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(curSum<0){
                curSum=0;
            }
            curSum=curSum+nums[i];
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
