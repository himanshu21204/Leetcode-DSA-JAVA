class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int ast : asteroids){
            if(sum >= ast){
                sum += ast;
            }else{
                return false;
            }
        }
        return true;
    }
}