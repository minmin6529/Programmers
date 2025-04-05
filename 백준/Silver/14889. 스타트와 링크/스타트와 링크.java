import java.util.Scanner;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // ▶ 인원 수 N 입력

        S = new int[N][N]; // ▶ 능력치 저장 배열
        visited = new boolean[N]; // ▶ 스타트팀 멤버 표시용

        // ▶ 능력치 배열 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();
            }
        }

        // ▶ 조합 시작: N명 중 N/2명을 스타트 팀으로 뽑기
        combination(0, 0);

        // ▶ 최종 결과 출력
        System.out.println(min);
    }

    // ▶ 조합 함수: depth는 지금까지 선택된 사람 수, idx는 탐색 시작 인덱스
    static void combination(int depth, int idx) {
        if (depth == N / 2) {
            // 스타트 팀이 N/2명 뽑히면 능력치 계산
            calculate();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;          // i번 사람을 스타트 팀으로 선택
                combination(depth + 1, i + 1); // 다음 사람 선택
                visited[i] = false;         // 백트래킹 (선택 취소)
            }
        }
    }

    // ▶ 능력치 계산 함수
    static void calculate() {
        int start = 0; // 스타트 팀 능력치
        int link = 0;  // 링크 팀 능력치

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 둘 다 스타트 팀이면
                if (visited[i] && visited[j]) {
                    start += S[i][j] + S[j][i];
                }
                // 둘 다 링크 팀이면
                else if (!visited[i] && !visited[j]) {
                    link += S[i][j] + S[j][i];
                }
            }
        }

        // 능력치 차이 계산
        int diff = Math.abs(start - link);
        min = Math.min(min, diff); // 최솟값 갱신

        // 최소 차이가 0이면 더 계산할 필요 없음
        if (min == 0) {
            System.out.println(0);
            System.exit(0); // 프로그램 즉시 종료
        }
    }
}