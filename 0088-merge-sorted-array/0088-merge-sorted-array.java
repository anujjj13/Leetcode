class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Pointer for the last element in the actual data in nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int idx = m + n - 1;  // Pointer for the last index of nums1 (where we are merging elements)

        // Merge the arrays from the end to the start (to avoid overwriting nums1's data)
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];  // Place the larger element in the correct position
                i--;  // Move the pointer for nums1
            } else {
                nums1[idx] = nums2[j];  // Place the larger element in the correct position
                j--;  // Move the pointer for nums2
            }
            idx--;  // Move the merge index
        }

        // If there are remaining elements in nums2, copy them over to nums1
        while (j >= 0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }
}
