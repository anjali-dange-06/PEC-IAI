import java.util.*;

class DFS {

    static void dfs(int node, ArrayList<ArrayList<Integer>> graph,
                    boolean[] visited) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int x : graph.get(node)) {
            if (!visited[x]) {
                dfs(x, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean[] visited = new boolean[5];

        dfs(0, graph, visited);
    }
}