
import java.util.Scanner;

public class Sum_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for(int i = 0; i < N; i++) {
            exist[arr[i]] = true;
        }
        int ans = 0;
        for(int i = 1; i <= (X - 1) / 2; i++) {
            if( i <= 1000000 && X - i <= 1000000)
                ans += (exist[i] && exist[X - i]) ? 1 : 0;
        }
        System.out.println(ans);

//        int[] cnt = new int[1000001];
//        for (int i = 0; i < N; i++)
//            cnt[a[i]]++;
//
//        long ans = 0;
//        for (int i = 1; i <= (X - 1) / 2; i++)
//            if (X - i <= 1000000)
//                ans += (long)cnt[i] * cnt[X - i];
//        System.out.println(ans);

//        for(int i = 0; i < N; i++) {
//            int pairVal = X - arr[i];
//            if(0 <= pairVal && pairVal <= 1000000)
//                ans += exist[pairVal] ? 1 : 0;
//        }
//        System.out.println(ans / 2);
    }
}
