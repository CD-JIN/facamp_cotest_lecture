import java.util.Scanner;

public class Search_Document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String target = sc.nextLine();
        int cnt = 0;

        for(int i = 0; i < doc.length(); i++) {
            boolean match = true;
            for(int j = 0; j < target.length(); j++) {
                if(i + j >= doc.length() || doc.charAt(i+j) != target.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if(match) {
                cnt++;
                i += target.length() - 1;
            }
        }

        System.out.println(cnt);
    }
}
