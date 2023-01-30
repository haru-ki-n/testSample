import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            count[scanner.nextInt() - 1]++;
        }
        int max = count[0];
        int maxNum = 1;
        for (int i = 1; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                maxNum = i + 1;
            }
        }
        System.out.println(maxNum);
    }
}
