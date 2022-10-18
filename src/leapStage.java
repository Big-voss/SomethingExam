import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1013 10:57
 */
public class leapStage {

    public static void main(String[] args) {
        int num = 0, first = 1, second = 2;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        } else {
            for (int i = 3; i <= n; i++) {
                num = first + second;
                first = second;
                second = num;
            }
            System.out.println(num);
        }
    }
}
