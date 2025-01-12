class Solution {
    public int[] sortArray(int[] nums) {
        insertionSort(nums);
        return nums;    
    }
    void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int k = i - 1;
            int x = arr[i];
            while(k>=0 && x < arr[k]){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = x;
        }
    }
}