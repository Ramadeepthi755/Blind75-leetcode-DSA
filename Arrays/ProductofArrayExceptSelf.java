//Problem : Product of Array Except Self
//Leetcode Link : https://leetcode.com/problems/product-of-array-except-self/description/

/*Approach : 
-Create an result Array to store result
-declare variables pre(left),post(right) to update values in array 
- First Assign 1 to all elements in array
-Then take prifix (leftside )elements to Result array
-then Multiply with postfix(rightSide) elements and store result Array
-return Result
*/

/* 
Time  Complecity : O(n)
Space Complecity : O(1)
*/ 

//code:
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,1);
        int pre=1,post=1;
        for(int i=0;i<nums.length;i++){
            result[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}
