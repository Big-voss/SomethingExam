import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1015 20:51
 */
public class lastWorldNumber {
    public static void main(String[] args) throws IOException {
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str != null) {
            String[] splits = str.split(" ");
            int len = splits[splits.length - 1].length();
            System.out.println(len);
        }*/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        System.out.println((split[split.length-1]).length());
    }
}
