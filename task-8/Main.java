import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        while (num != 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
    }
}