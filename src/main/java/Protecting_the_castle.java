import java.util.Scanner;

public class Protecting_the_castle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 세로 N, 행
        int M = sc.nextInt(); // 가로 M, 열


        char[][] arr = new char[N][M];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }

        boolean[] existR = new boolean[N];
        boolean[] existC = new boolean[M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr[i][j] == 'X') {
                    existR[i] = true;
                    existC[j] = true;
                }
            }
        }

        int needSecurityR = N;
        int needSecurytyC = M;

        for(int i = 0; i < N; i++) {
            if(existR[i]) needSecurityR--;
        }

        for(int i = 0; i < M; i++) {
            if(existC[i]) needSecurytyC--;
        }
        System.out.println(Math.max(needSecurityR, needSecurytyC));
    }
}
