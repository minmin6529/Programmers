import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }
        
        dfs(1, numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }
    
    static void dfs(int idx, int result) {
        if (idx == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                
                switch(i) {
                    case 0: dfs(idx + 1, result + numbers[idx]); break;
                    case 1: dfs(idx + 1, result - numbers[idx]); break;
                    case 2: dfs(idx + 1, result * numbers[idx]); break;
                    case 3: dfs(idx + 1, divide(result, numbers[idx])); break;
                }
                
                operators[i]++;
            }
        }
    }
    
    static int divide(int a, int b) {
        if (a < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}