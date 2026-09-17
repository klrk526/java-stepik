import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        boolean value = false;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                value = true;
            } 
        } if (!value) {
            System.out.println("Таких чисел нет");
        }
    }
}