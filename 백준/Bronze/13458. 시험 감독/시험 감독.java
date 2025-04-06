import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        long result = 0;
        
        for (int i = 0; i < N; i++) {
            result++;
            
            int remain = A[i] - B;
            
            if (remain > 0) {
                result += (remain + C - 1) / C;
            }
        }
        
        System.out.println(result);
    }
}