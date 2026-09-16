import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        while (num != 0) {
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}