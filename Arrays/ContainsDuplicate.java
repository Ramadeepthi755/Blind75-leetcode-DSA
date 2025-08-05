//My Profile : https://leetcode.com/u/Ramadeepthi/
//Problem : Contains Duplicate 
//Letcode Link : https://leetcode.com/problems/contains-duplicate/

/* Approach :
-Create Hash set as visited to store and check elements in array of nums
-Hash set checks elements if it exits then prints true
-if elements are not there is moves to hashset
-if none element matches with elements in Hashset then prints false
    */

/*
Time Complexity : O(n)
Space Complexity : O(n) 
    */

//code
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> visited=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(visited.contains(nums[i])){
                return true;
            }else{
                visited.add(nums[i]);
            }
        }
        return false;
    }
}
