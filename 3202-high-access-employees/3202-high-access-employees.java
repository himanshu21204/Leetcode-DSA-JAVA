class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        Map<String,List<Integer>> map = new HashMap<>();

        for(List<String> temp : access_times){
            String emp = temp.get(0);
            String time = temp.get(1);
            if(!map.containsKey(emp)){
                map.put(emp,new ArrayList<>());
            }
            int t = Integer.parseInt(time);
            map.get(emp).add(t);
        }
        for(String emp : map.keySet()){
            List<Integer> times = map.get(emp);
            Collections.sort(times);
            if(isHigh(times)){
                ans.add(emp);
            }
        }
        return ans;
    }
    boolean isHigh(List<Integer> list){
        for (int i = 2; i < list.size(); i++) {
            int curr = list.get(i);
            int prevprev = list.get(i-2);
            if(prevprev + 99 >= curr) return true;
        }
        return false;
    }
}