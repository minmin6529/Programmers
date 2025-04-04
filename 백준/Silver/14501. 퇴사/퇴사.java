import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ▶ 총 상담 일수 N을 입력받음 (1 ≤ N ≤ 15)

        // ▶ 각 날짜마다 상담에 걸리는 기간과 보상을 저장할 배열 생성
        // N+2 크기로 설정한 이유는, 최대 N+1일(퇴사일)까지 고려해야 하기 때문!
        int[] T = new int[N + 2]; // 상담에 걸리는 기간
        int[] P = new int[N + 2]; // 상담 시 받을 수 있는 금액
        int[] dp = new int[N + 2]; // 해당 날짜까지의 최대 이익을 저장하는 DP 배열

        // ▶ T와 P 배열 입력 받기 (1일부터 N일까지)
        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt(); // i일에 상담하는 데 걸리는 기간
            P[i] = sc.nextInt(); // i일에 상담하면 받을 수 있는 금액
        }

        // ▶ DP 계산 시작
        for (int i = 1; i <= N + 1; i++) {
            // ----------------------
            // 1. 상담을 "하지 않고" 다음 날로 넘긴 경우
            // 이전까지의 최대 수익을 다음 날에도 유지하도록 갱신
            dp[i] = Math.max(dp[i], dp[i - 1]);

            // ----------------------
            // 2. 상담을 "하는 경우"
            // i일부터 시작한 상담이 퇴사일 전까지 끝날 수 있는지 확인
            if (i + T[i] <= N + 1) {
                // i일부터 T[i]일 후 날까지 상담을 하면,
                // 그 날의 dp 값에 이익을 반영 (기존 값과 비교해 더 큰 값을 저장)
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }

        // ▶ 최종적으로 퇴사일(N+1일)에 얻을 수 있는 최대 이익 출력
        System.out.println(dp[N + 1]);
    }
}