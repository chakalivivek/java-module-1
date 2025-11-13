import java.util.Arrays;

public class simplifiedLSR {
    static int INF = 9999;

    public static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int;
        boolean[] visited = new boolean;

        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != INF &&
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
    }
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, min_index = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
}

