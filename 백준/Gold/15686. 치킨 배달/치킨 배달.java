import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static List<Point> home = new ArrayList<>();
    static List<Point> chicken = new ArrayList<>();
    static boolean[] selected;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();

                if (map[i][j] == 1) home.add(new Point(i, j));      // 집
                else if (map[i][j] == 2) chicken.add(new Point(i, j));  // 치킨집
            }
        }

        selected = new boolean[chicken.size()];
        combination(0, 0);
        System.out.println(min);
    }

    // 치킨집 M개 조합 선택 (백트래킹)
    static void combination(int depth, int start) {
        if (depth == M) {
            calcCityChickenDistance(); // 조합이 완성되면 거리 계산
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            selected[i] = true;
            combination(depth + 1, i + 1);
            selected[i] = false;
        }
    }

    // 도시의 치킨 거리 계산
    static void calcCityChickenDistance() {
        int total = 0;

        for (Point h : home) {
            int dist = Integer.MAX_VALUE;

            for (int i = 0; i < chicken.size(); i++) {
                if (!selected[i]) continue;

                Point c = chicken.get(i);
                int d = Math.abs(h.x - c.x) + Math.abs(h.y - c.y); // 맨해튼 거리
                dist = Math.min(dist, d);
            }

            total += dist;
        }

        min = Math.min(min, total); // 최소 치킨 거리 갱신
    }

    // 좌표 저장용 Point 클래스
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}