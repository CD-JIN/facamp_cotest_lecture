import java.util.Scanner;

public class Line_up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt(); // 테스트 수

        while (P-- > 0) {
            int T = sc.nextInt(); // 테스트 번호

            int[] arr = new int[20];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int cnt = 0;

            int[] sorted = new int[20];
            for(int i = 0; i < 20; i++) {
                boolean find = false;

                for(int j = 0; j < i; j++) {
                    if(sorted[j] > arr[i]) {
                        find = true;
                        for(int k = i - 1; k >= j; k--) {
                            sorted[k+1] =  sorted[k];
                            cnt++;
                        }
                        sorted[j] = arr[i];
                        break;
                    }
                }
                if(!find) {
                    sorted[i] = arr[i];
                }
            }
            System.out.println(T + " " + cnt);
        }
    }
}
