
import java.util.Scanner;

public class Make_Anagram {

    public static int[] get_count(String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i)- 'a']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        int[] arr1 = get_count(str1);
        int[] arr2 = get_count(str2);

        for(int i = 0; i < arr1.length; i++) {
            cnt += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(cnt);
    }
}
