import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1013 15:23
 */
public class leapStage02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0, first = 1, second = 2;
        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        }else{
            num = (int) Math.pow(2, n - 1);
            System.out.println(num);
        }
    }
}

