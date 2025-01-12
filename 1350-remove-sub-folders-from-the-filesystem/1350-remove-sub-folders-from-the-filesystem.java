class Solution {
    public List<String> removeSubfolders(String[] fol) {
        Arrays.sort(fol);

        List<String> ans = new ArrayList<>();
        ans.add(fol[0]);

        for (int i = 1; i < fol.length; i++) {
            String lastFol = ans.getLast() + "/";

            if(!fol[i].startsWith(lastFol)){
                ans.add(fol[i]);
            }
        }
        return ans;
    }
}