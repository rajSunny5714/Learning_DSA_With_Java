package Array;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = searchInsert(arr, target);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}


//35. Search Insert Position
//
//        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1

//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
//