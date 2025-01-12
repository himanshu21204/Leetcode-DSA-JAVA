class Solution {
    public int totalFruit(int[] arr) {
        int start = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            map.put(temp,map.getOrDefault(temp,0)+1);

            while (map.size() > 2){
                temp = arr[start];
                map.put(temp,map.getOrDefault(temp,0)-1);
                if(map.get(temp) == 0){
                    map.remove(temp);
                }
                start++;
            }
            ans = Math.max(ans,(i-start+1));
        }
        return ans;
    }
}