
import java.util.Scanner;

public class Change_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for(char c : arr) {
            String tmp = ""+c;
            if(Character.isUpperCase(c)) sb.append(tmp.toLowerCase());
            else sb.append(tmp.toUpperCase());
        }
        System.out.println(sb.toString());
    }
}
