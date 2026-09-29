import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] num = x.split(" ");
        int length = num.length;
        int i = 0;
       for (i = 0; i < length; i++) {
        int nums = Integer.parseInt(num[i]);
        int j = 0;
        for (j = 2; j < 6; j++) {
            int y = (int) Math.pow(nums, j);
            if (j > 2) {
                System.out.print(" ");
            }
            System.out.print(y);
        }
        System.out.println();
       }
    }
}