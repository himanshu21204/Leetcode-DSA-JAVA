class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> list = new ArrayList<>();
       cyclesort(nums);
       for(int i=0;i<nums.length;i++){
           if(i!=nums[i]-1){
               list.add(nums[i]);
           }
       }
       return list;
    }
    void cyclesort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int currect = arr[i]-1;
            if(arr[i] != arr[currect]){
                int temp = arr[i];
                arr[i] = arr[currect];
                arr[currect] = temp;
            } else {
                i++;
            }
        }
    }
}