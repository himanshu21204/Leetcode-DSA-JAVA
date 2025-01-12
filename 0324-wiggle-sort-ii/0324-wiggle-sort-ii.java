class Solution {
    public void wiggleSort(int[] nums) {
        // nums[0] < nums[1] > nums[2] < nums[3] > nums[4] => This is Given Condition
        // if you see properly then you realize every odd index element are Max for previous and next element
        // then We can Try this:
        // Step 1 : Create Duplicate array and Sort that array
        // Step 2 : fill odd index from last index from duplicate sorted array
        // step 3 : now fill even index
        int len = nums.length;
        int[] arr = new int[len];

        // System.arraycopy(nums, 0, arr, 0, len);
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int idx = len - 1;

        int i = 1;
        while (i < len){
            nums[i] = arr[idx--];
            i += 2;
        }
        i = 0;
        while (i < len){
            nums[i] = arr[idx--];
            i += 2;
        }
    }
}