import java.util.*;

class BFS {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean[] visited = new boolean[5];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int x : graph.get(node)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}