class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // create a pq (decreasing order of element count)
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        if(a>0){
            pq.offer(new Pair(a,'a'));
        }
        if(b>0){
            pq.offer(new Pair(b,'b'));
        }
        if(c>0){
            pq.offer(new Pair(c,'c'));
        }

        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            int n = res.length(); 
            char ch = node.ch;
            int count = node.count;
            if(n>=2 && res.charAt(n-1) == ch && res.charAt(n-2) == ch) {
                if(pq.isEmpty()) break;
                Pair sec = pq.poll();
                res.append(sec.ch);
                sec.count--;
                if(sec.count>0){
                    pq.offer(new Pair(sec.count,sec.ch));
                }
            }else{
                res.append(node.ch);
                node.count--;
            }
            // if element count is not 0, insert in pq with updated count
            if(node.count>0){
                pq.offer(new Pair(node.count,node.ch));
            }
        }
        return res.toString();

        // StringBuilder sb = new StringBuilder();
        
        // int totalLength = a + b + c;
        // int continuousA = 0, continuousB = 0, continuousC = 0;
        
        // for(int i = 0; i < totalLength; i++) {
        //     if ((a >= b && a >= c && continuousA != 2) || (continuousB == 2 && a > 0) || (continuousC == 2 && a > 0))  {
        //         sb.append("a");
        //         a--;
        //         continuousA++;
        //         continuousB = 0;
        //         continuousC = 0;  
        //     } else if ((b >= a && b >= c && continuousB != 2) || (continuousA == 2 && b > 0) || (continuousC == 2 && b > 0)) {
        //         sb.append("b");
        //         b--;
        //         continuousB++;
        //         continuousA = 0;
        //         continuousC = 0;
        //     } else if ((c >= a && c >= b && continuousC != 2) || (continuousB == 2 && c > 0) || (continuousA == 2 && c > 0)) {
        //         sb.append("c");
        //         c--;
        //         continuousC++;
        //         continuousA = 0;
        //         continuousB = 0;  
        //     }
        // }
        // return sb.toString();
    }
}


class Pair implements Comparable<Pair> {
    int count;
    char ch;
    Pair(int count, char ch){
        this.count = count;
        this.ch = ch;
    } 
    public int compareTo(Pair that){
        return that.count - this.count;
    }
}
