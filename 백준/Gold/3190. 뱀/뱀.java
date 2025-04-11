import java.util.*;

public class Main {
    static int N;
    static int[][] board;
    static Map<Integer, Character> turns = new HashMap<>();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        
        board = new int[N][N];
        
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            board[x][y] = 1;
        }
        
        int L = sc.nextInt();
        
        for (int i = 0; i < L; i++) {
            int time = sc.nextInt();
            char dir = sc.next().charAt(0);
            turns.put(time, dir);
        }
        
        System.out.println(simulate());
    }
    
    public static int simulate() {
        int time = 0;
        int direction = 0;
        Deque<int[]> snake = new ArrayDeque<>();
        snake.offerFirst(new int[]{0, 0});
        board[0][0] = 2;
        
        while (true) {
            time++;
            int[] head = snake.peekFirst();
            int nx = head[0] + dx[direction];
            int ny = head[1] + dy[direction];
            
            if (nx < 0 || ny < 0 || nx >= N || ny >= N || board[nx][ny] == 2) {
                return time;
            }
            
            if (board[nx][ny] == 1) {
                board[nx][ny] = 2;
                snake.offerFirst(new int[]{nx, ny});
            } else {
                board[nx][ny] = 2;
                snake.offerFirst(new int[]{nx, ny});
                int[] tail = snake.pollLast();
                board[tail[0]][tail[1]] = 0;
            }
            
            if (turns.containsKey(time)) {
                char c = turns.get(time);
                if (c == 'D') {
                    direction = (direction + 1) % 4;
                } else {
                    direction = (direction + 3) % 4;
                }
            }
        }
    }
}