import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1016 11:18
 */
public class Test05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(a[i]<x){
                k--;
            }
            a[i] = a[i] + 1;
            if(n==0){
                a[i] = 0;
            }
            System.out.println(a[i]);
        }

    }
}
