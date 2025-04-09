import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] cloud;
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1}; // ←, ↖, ↑, ↗, →, ↘, ↓, ↙
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static List<int[]> clouds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        map = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                map[i][j] = sc.nextInt();

        for (int i = N - 2; i <= N - 1; i++)
            for (int j = 0; j <= 1; j++)
                clouds.add(new int[]{i, j}); // 초기 구름

        for (int i = 0; i < M; i++) {
            int d = sc.nextInt() - 1;
            int s = sc.nextInt();
            moveClouds(d, s);     // 1. 구름 이동
            rain();               // 2. 비 내리기
            waterCopyBug();       // 3. 물복사 버그
            generateNewClouds();  // 4. 새 구름 생성
        }

        int answer = 0;
        for (int[] row : map)
            for (int val : row)
                answer += val;

        System.out.println(answer);
    }

    static void moveClouds(int d, int s) {
        for (int i = 0; i < clouds.size(); i++) {
            int x = clouds.get(i)[0];
            int y = clouds.get(i)[1];
            x = (x + dx[d] * s + N * 100) % N; // 음수 방지용 + N * 100
            y = (y + dy[d] * s + N * 100) % N;
            clouds.set(i, new int[]{x, y});
        }
    }

    static void rain() {
        cloud = new boolean[N][N];
        for (int[] c : clouds) {
            int x = c[0], y = c[1];
            map[x][y]++;
            cloud[x][y] = true; // 구름 있었던 위치 표시
        }
    }

    static void waterCopyBug() {
        for (int[] c : clouds) {
            int x = c[0], y = c[1];
            int cnt = 0;
            for (int i = 1; i < 8; i += 2) { // 대각선만 확인 (1,3,5,7)
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && map[nx][ny] > 0)
                    cnt++;
            }
            map[x][y] += cnt;
        }
    }

    static void generateNewClouds() {
        List<int[]> newClouds = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!cloud[i][j] && map[i][j] >= 2) {
                    newClouds.add(new int[]{i, j});
                    map[i][j] -= 2;
                }
            }
        }
        clouds = newClouds; // 갱신
    }
}