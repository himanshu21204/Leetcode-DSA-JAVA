package GeekForGeeks;
// https://www.geeksforgeeks.org/problems/shortest-job-first/0
import java.util.*;
public class ShortestJobFirst {
    static int solve(int[] bt) {
        Arrays.sort(bt);
        int wt = 0;
        int sum = 0;

        for(int num : bt){
            sum += wt;
            wt += num;
        }
        return sum / bt.length;
    }
}
