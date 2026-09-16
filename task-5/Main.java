import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            String word = sc.next();
            count += 1;
        }
        System.out.println(count);
    }
}