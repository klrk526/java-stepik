import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num = sc.nextInt();
        while (num % 11 == 0) {
            count += 1;
            
            if (num % 3 == 0) {
                sum = num + sum;
            }
            num = sc.nextInt();
        }
        System.out.println(count);
        System.out.println(sum);
    }
}