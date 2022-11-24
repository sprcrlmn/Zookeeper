import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 0;
        while (x != 0) {
            ++i;
            x = scanner.nextInt();
        }
        System.out.println(i);
    }
}