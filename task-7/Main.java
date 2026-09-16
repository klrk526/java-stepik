import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (num > 0 && num < 11) {
            sum = num + sum;
            count += 1;
            num = sc.nextInt();
        }
        double sred = sum % count;
        System.out.println(sred);
    }
}