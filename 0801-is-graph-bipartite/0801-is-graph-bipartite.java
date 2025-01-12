class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] vis = new int[V];
        Arrays.fill(vis, -1);

        for (int i = 0; i < V; i++) {
            if (vis[i] == -1) {
                if (!check(i, graph, vis)) return false;
            }
        }
        return true;
    }

    boolean check(int start, int[][] graph, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vis[start] = 0;

        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int neighbor : graph[temp]) {
                if (vis[neighbor] == -1) {
                    vis[neighbor] = 1 - vis[temp];
                    q.add(neighbor);
                } else if (vis[neighbor] == vis[temp]) {
                    return false;
                }
            }
        }
        return true;
    }
}