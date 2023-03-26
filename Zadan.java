import java.util.Scanner;

public class Zadan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = nums.length - 1; i >= 0; i--)  {
            System.out.print(nums[i] + " ");

        }
    }
}

