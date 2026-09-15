import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] nums = x.split(" ");
        int x1 = Integer.parseInt(nums[0]);
        int x2 = Integer.parseInt(nums[1]);
        int x3 = Integer.parseInt(nums[2]);
        if (x1 % 2 == 0) {
            if (x1 > x2 && x1 > x3) {
                System.out.println(x3);
            }
        } else if (x2 % 2 == 0) {
            if (x2 > x1 && x2 > x3) {
                System.out.println(x2);
            }
        } else if (x3 % 2 == 0) {
            if (x3 > x1 && x3 > x2) {
                System.out.println(x3);
            }
        } else {
            System.out.println("Четных чисел нет");
        }
    }
}

