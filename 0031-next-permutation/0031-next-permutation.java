import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length ;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no such element is found, that means the array is sorted in descending order
        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        // Step 2: Find the element just larger than nums[pivot] from the right
        for (int i = n-1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                // Swap the elements
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Step 3: Reverse the portion of the array from pivot+1 to end
        int i = pivot + 1, j = n-1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
