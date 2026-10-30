import java.util.*;

class BestFirstSearch {

    static void bfs(int start, int goal, int[][] graph, int[] h) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> h[a] - h[b]);

        boolean[] visited = new boolean[graph.length];

        pq.add(start);

        while (!pq.isEmpty()) {

            int node = pq.poll();

            if (visited[node])
                continue;

            visited[node] = true;
            System.out.print(node + " ");

            if (node == goal)
                break;

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    pq.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0,1,1,0,0},
            {1,0,0,1,1},
            {1,0,0,0,0},
            {0,1,0,0,0},
            {0,1,0,0,0}
        };

        int[] h = {5, 3, 4, 1, 2};

        bfs(0, 3, graph, h);
    }
}