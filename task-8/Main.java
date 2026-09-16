import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            int num1 = num % 10;
            System.out.println(num1);
            int num2 = num / 10;
        }
    }
}