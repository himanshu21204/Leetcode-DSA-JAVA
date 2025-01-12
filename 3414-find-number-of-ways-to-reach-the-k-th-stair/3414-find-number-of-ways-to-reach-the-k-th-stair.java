class Solution {
    private Map<String, Integer> map;

int rec(int curr, int j, int k, int flag) {
	if(curr-k > 1) return 0;

	String key = (curr+""+j+""+flag);
	if(map.containsKey(key)) return map.get(key);

	int ct = curr==k? 1: 0;
	if(flag==1 && curr>0){
		ct += rec(curr-1, j, k, 0);
	}
	ct += rec(curr+(1<<j), j+1, k, 1);

	map.put(key, ct);
	return ct;
}

public int waysToReachStair(int k) {
	map = new HashMap<>();
	return rec(1, 0, k, 1);
}
}