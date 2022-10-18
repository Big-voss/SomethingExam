import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1015 19:41
 */
public class capitalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                a++;
            }
        }
        System.out.println(a);
    }
}
