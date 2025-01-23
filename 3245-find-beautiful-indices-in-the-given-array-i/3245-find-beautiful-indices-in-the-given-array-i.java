class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        find(s,a,list1);
        find(s,b,list2);

        List<Integer> list = new ArrayList<>();
        for (int x : list1){
            for (int y : list2){
                if(Math.abs(x-y)<=k){
                    list.add(x);
                    break;
                }
            }
        }
        return list;
    }
    void find(String s,String temp,ArrayList<Integer> list){
        int pos = s.indexOf(temp,0);
        if(pos == -1) return;

        while (pos != -1){
            list.add(pos);
            pos = s.indexOf(temp,pos + 1);
        }
    }
}