class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill); // Sort The Array
        int target = skill[0] + skill[n-1];
        long ans = (long) skill[0] * skill[n-1];

        int start = 1;
        int end = n-2;
        while (start<end){
            if(skill[start] + skill[end] == target){
                ans += (long) skill[start] * skill[end];
            }else {
                return -1;
            }
            start++;
            end--;
        }
        return ans;
    }
}