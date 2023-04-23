import java.util.Scanner;

public class Eureka {
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        int[] triangleNumbers = new int[50];
        int triangleNumberCnt = 0;
        for(int i = 1; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if(triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCnt++] = triangleNumber;
        }

        boolean[] isSumOfTriangleNumber = new boolean[1000];
        for(int i = 0; i < triangleNumberCnt; i++) {
            for(int j = 0; j < triangleNumberCnt; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if(sum < 1000) isSumOfTriangleNumber[sum] = true;
            }
        }

        for(int i = 1; i < 1000; i++) {
            if(!isSumOfTriangleNumber[i]) continue;
            for(int j = 0; j < triangleNumberCnt; j++) {
                int sum = i + triangleNumbers[j];
                if(sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }

    public static void main(String[] args) {
        preprocess();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int K = sc.nextInt();
            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }
}
