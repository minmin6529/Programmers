import java.util.*;

public class Main {
    static int N, L, R;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        
        map = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        int days = 0;
        
        while (true) {
            visited = new boolean[N][N];
            boolean moved = false;
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        if (bfs(i, j)) {
                            moved = true;
                        }
                    }
                }
            }
                            
            if (!moved) break;
            days++;
        }
                            
        System.out.println(days);
    }
                            
    static boolean bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        List<Point> union = new ArrayList<>();
        
        queue.offer(new Point(x, y));
        union.add(new Point(x, y));
        visited[x][y] = true;
        
        int sum = map[x][y];
        
        while (!queue.isEmpty()) {
            Point now = queue.poll();
            
            for (int d = 0; d < 4; d++) {
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];
                
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (visited[nx][ny]) continue;
                
                int diff = Math.abs(map[now.x][now.y] - map[nx][ny]);
                
                if (diff >= L && diff <= R) {
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                    union.add(new Point(nx, ny));
                    sum += map[nx][ny];
                }
            }
        }
        
        if (union.size() == 1) return false;
        
        int avg = sum / union.size();
        for (Point p : union) {
            map[p.x][p.y] = avg;
        }
        
        return true;
    }
                            
    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}