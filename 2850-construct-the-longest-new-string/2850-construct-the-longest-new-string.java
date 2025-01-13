class Solution {
    public int longestString(int x, int y, int z) {
        // Find the minimum of x and y
        int min = Math.min(x, y);
        
        // If x and y are equal, calculate the result using a specific formula
        if (x == y) {
            // When x equals y, the result is (min * 2 + z) * 2
            return (min * 2 + z) * 2;
        }
        
        // If x is not equal to y, calculate the result using another formula
        // Here, we add 1 to the sum of min * 2 and z before multiplying by 2
        return (min * 2 + 1 + z) * 2;        
    }
}