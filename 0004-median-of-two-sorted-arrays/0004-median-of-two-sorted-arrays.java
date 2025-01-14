class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int totalLength = n1 + n2;
        int midIndex1 = (totalLength - 1) / 2;
        int midIndex2 = totalLength / 2;

        int i = 0, j = 0, count = 0;
        int midValue1 = 0, midValue2 = 0;

        while (i < n1 || j < n2) {
            int val;
            if (i < n1 && (j >= n2 || nums1[i] < nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            // Check if current element is one of the median elements
            if (count == midIndex1) midValue1 = val;
            if (count == midIndex2) {
                midValue2 = val;
                break; // No need to continue after finding both median values
            }

            count++;
        }

        // Calculate median
        return (midValue1 + midValue2) / 2.0;
    }
}
