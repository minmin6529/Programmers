import java.util.*;

public class Main {
    static int N;
    static int[][] classroom;
    static Map<Integer, Set<Integer>> studentPref = new HashMap<>();
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        classroom = new int[N][N];

        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < N * N; i++) {
            int student = sc.nextInt();
            order.add(student);
            Set<Integer> prefs = new HashSet<>();
            for (int j = 0; j < 4; j++) {
                prefs.add(sc.nextInt());
            }
            studentPref.put(student, prefs);
        }

        for (int student : order) {
            placeStudent(student);
        }

        System.out.println(calculateSatisfaction());
    }

    static void placeStudent(int student) {
        int maxLike = -1, maxEmpty = -1;
        int finalX = -1, finalY = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (classroom[i][j] != 0) continue;

                int like = 0, empty = 0;
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];
                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    if (studentPref.get(student).contains(classroom[nx][ny])) like++;
                    if (classroom[nx][ny] == 0) empty++;
                }

                if (like > maxLike || 
                    (like == maxLike && empty > maxEmpty) ||
                    (like == maxLike && empty == maxEmpty && (i < finalX || (i == finalX && j < finalY)))) {
                    maxLike = like;
                    maxEmpty = empty;
                    finalX = i;
                    finalY = j;
                }
            }
        }

        classroom[finalX][finalY] = student;
    }

    static int calculateSatisfaction() {
        int total = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int student = classroom[i][j];
                int likeCount = 0;

                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];
                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    if (studentPref.get(student).contains(classroom[nx][ny])) likeCount++;
                }

                if (likeCount == 1) total += 1;
                else if (likeCount == 2) total += 10;
                else if (likeCount == 3) total += 100;
                else if (likeCount == 4) total += 1000;
            }
        }

        return total;
    }
}