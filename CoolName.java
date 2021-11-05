import java.util.Arrays;
import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 60) {
            for (int i = 0; i < t; i++) {
                int ans = 0;
                String s = sc.next();
                char charArray[] = s.toCharArray();
                Arrays.sort(charArray);
                int l=charArray.length;
                for (int j = 0; j < l; j++) {
                    ans+=(j+1)*(charArray[j]-96);
                }    
                System.out.println(ans);
            }
        }
    }
}
