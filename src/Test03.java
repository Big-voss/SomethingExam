import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1015 20:40
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
            for (int i = 0; i < n; i++) {
                int add = scanner.nextInt();
                sum = sum + add;
            }
            int a = sum % 1000000007;
            System.out.println(a);
    }
}
