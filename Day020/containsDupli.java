/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        int count =0;
        for(int i:nums){
            if(set.contains(i)){
                count++;
            }else{
                set.add(i);
            }
        }
        if(count>=1){
            return true;
        }else{
            return false;
        }
        
    }
}
