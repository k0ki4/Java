import java.util.Scanner;

public class DZ34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[15];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        System.out.println(sum / nums.length);
    }
}
