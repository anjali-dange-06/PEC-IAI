import java.util.*;

class Astar {
    static int heuristic(int a, int b) {
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        int[] graph = {0, 1, 2, 3, 4};
        int start = 0, goal = 4;

        int[] g = new int[graph.length];
        Arrays.fill(g, Integer.MAX_VALUE);
        g[start] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Comparator.comparingInt(n -> g[n] + heuristic(n, goal))
        );

        pq.add(start);

        while (!pq.isEmpty()) {
            int current = pq.poll();

            if (current == goal) {
                System.out.println("Goal reached!");
                System.out.println("Cost: " + g[current]);
                return;
            }

            int next = current + 1;

            if (next < graph.length && g[current] + 1 < g[next]) {
                g[next] = g[current] + 1;
                pq.add(next);
            }
        }
    }
}