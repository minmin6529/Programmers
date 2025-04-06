import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cleaned = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        map = new int[N][M];
        visited = new boolean[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        clean(r, c, d);
        
        System.out.println(cleaned);
    }
    
    static void clean(int x, int y, int dir) {
        if (!visited[x][y]) {
            visited[x][y] = true;
            cleaned++;
        }
        
        for (int i = 0; i < 4; i++) {
            dir = (dir + 3) % 4;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (isIn(nx, ny) && map[nx][ny] == 0 && !visited[nx][ny]) {
                clean(nx, ny, dir);
                return;
            }
        }
        
        int back = (dir + 2) % 4;
        int bx = x + dx[back];
        int by = y + dy[back];
        
        if (isIn(bx, by) && map[bx][by] == 0) {
            clean(bx, by, dir);
        }
    }
    
    static boolean isIn(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}