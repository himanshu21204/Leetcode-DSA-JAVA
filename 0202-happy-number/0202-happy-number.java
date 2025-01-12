class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = sqrt(slow);
            fast = sqrt(sqrt(fast));
        }while(slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }
    int sqrt(int n){
        int temp = 0;
        while(n > 0){
            int rem = n%10;
            temp += (rem * rem);
            n /= 10;
        }
        return temp;
    }
}