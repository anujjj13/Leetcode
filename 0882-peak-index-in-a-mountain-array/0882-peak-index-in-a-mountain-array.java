class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int largest=arr[0];
        // for(int i =1;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         largest=arr[i];
        //     }
        //     //largest = arr[i];
        // }
        int mid=0;
        int low=0,high=arr.length-1;
        while(low<high){
            mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
           
            else{
                high=mid;
            }
        }
        return low;
    }
}