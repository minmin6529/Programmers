import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 벨트의 절반 길이
        int K = sc.nextInt(); // 내구도 0인 칸이 K개 이상이면 종료

        int[] belt = new int[2 * N]; // 벨트 내구도 배열
        for (int i = 0; i < 2 * N; i++) {
            belt[i] = sc.nextInt();
        }

        boolean[] robot = new boolean[N]; // 로봇이 존재하는지 표시
        int step = 0; // 몇 단계가 지났는지

        while (true) {
            step++;

            // 1. 벨트 회전 + 로봇 회전
            int last = belt[2 * N - 1];
            for (int i = 2 * N - 1; i > 0; i--) {
                belt[i] = belt[i - 1];
            }
            belt[0] = last;

            for (int i = N - 1; i > 0; i--) {
                robot[i] = robot[i - 1];
            }
            robot[0] = false;
            robot[N - 1] = false; // 내리는 위치는 항상 비워야 함

            // 2. 로봇 이동
            for (int i = N - 2; i >= 0; i--) {
                if (robot[i] && !robot[i + 1] && belt[i + 1] > 0) {
                    robot[i] = false;
                    robot[i + 1] = true;
                    belt[i + 1]--;
                }
            }
            robot[N - 1] = false;

            // 3. 로봇 올리기
            if (belt[0] > 0) {
                robot[0] = true;
                belt[0]--;
            }

            // 4. 내구도 0인 칸 개수 세기
            int zeroCount = 0;
            for (int i = 0; i < 2 * N; i++) {
                if (belt[i] == 0) zeroCount++;
            }

            if (zeroCount >= K) break;
        }

        System.out.println(step);
    }
}