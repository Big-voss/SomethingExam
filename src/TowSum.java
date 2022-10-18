import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 1013 20:13
 */
public class TowSum {
    public static void main(String[] args) {
        int numbers[] = {3,2,4};
        int target = 6;
        TowSum towSum = new TowSum();
        int[] ints = towSum.twoSum(numbers, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }
    public int[] twoSum (int[] numbers, int target) {
        int[] a = new int[2];
        int j = 0;
        Map map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(!map.containsKey(target - numbers[i])){
                map.put(numbers[i],i + 1);
            }else{
                a[j++] = (int)map.get(target - numbers[i]);
                a[j] = i + 1;
            }
        }
        Arrays.sort(a);
        return a;
    }
}
