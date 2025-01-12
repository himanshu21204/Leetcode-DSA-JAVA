class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }

        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 1;
        for (int num : arr){
            if(!(map.containsKey(num))){
                map.put(num,i++);
            }
        }

        for (int j = 0; j < ans.length; j++) {
            int temp = map.get(ans[j]);
            ans[j] = temp;
        }
        return ans;
    }
}