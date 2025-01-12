// class Solution {
//     public int findDuplicate(int[] nums) {
//        cyclicsort(nums);
//        for(int i=0;i<nums.length;i++){
//            if(i!=nums[i]-1){
//                return nums[i];
//            }
//        } 
//        return -1;
//     }
//     void cyclicsort(int[] arr){
//         int i = 0;
//         while(i<arr.length){
//             int currect = arr[i]-1;
//             if(arr[i] != arr[currect]){
//                 int temp = arr[i];
//                 arr[i] = arr[currect];
//                 arr[currect] = temp;
//             } else {
//                 i++;
//             }
//         }
//     }
// }


class Solution{
    public int findDuplicate(int[] nums){
        // boolean [] duplicates = new boolean[nums.length];
        // for(int i: nums){
        //     if(duplicates[i]){
        //         return i;
        //     }
        //     duplicates[i]=true;
        // }
        // return -1;
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        while (slow != fast);

        int slow2 = 0;

        do {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        while (slow != slow2);

        return slow2;
    }
}