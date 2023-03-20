
import java.util.Scanner;

public class Make_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i)- 'a']++;
        }

        for(int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) cnt += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(cnt);
    }
}
