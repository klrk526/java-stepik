import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookvs = sc.nextLine();
        String[] bookv = bookvs.split(" ");
        char bookv_left = bookv[0].charAt(0);
        char bookv_right = bookv[1].charAt(0);
        char left;
        char right;
        if (bookv_left < bookv_right) {
            left = bookv_left;
            right = bookv_right;
        } else {
            left = bookv_right;
            right = bookv_left;
        }
        String words = sc.nextLine();
        String[] word = words.split(" ");
        int i = 0;
        while (i < word.length) {
            char letter = word[i].charAt(0);
            if (letter >= left && letter <= right) {
                System.out.println(word[i]);
                
            }
            i++;
        }
    }
}