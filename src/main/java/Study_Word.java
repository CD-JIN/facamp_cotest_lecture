
import java.util.Scanner;

public class Study_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int cnt = Integer.MIN_VALUE;

        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'A']++;
        }
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > cnt) {
                cnt = arr[i];
                answer = "" + (char)('A'+i);
            } else if(cnt == arr[i]) {
                answer = "?";
            }
        }

        System.out.println(answer);
    }
}
