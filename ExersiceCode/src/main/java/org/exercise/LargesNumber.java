package org.exercise;

public class LargesNumber {
    public static void main(String[] args) {
        int [] nums = {0,2,5,7,9};
        int max = nums[0];
        for (int i = 1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("Largest number:  " + max);
    }
}
