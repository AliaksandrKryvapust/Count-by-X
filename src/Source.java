import java.util.Arrays;
import java.util.Objects;

public class Source {
    public static void main(String[] args) {
    int a = 2;
    int b = 5;
        System.out.println(Arrays.equals(countBy(a, b), new int[]{2, 4, 6, 8, 10}));
    }
    public static int[] countBy(int x, int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
        result[i]=x*(i+1);
        }
        return result;
    }
}
