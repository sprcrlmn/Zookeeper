import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 1) {
            System.out.println("no army");
        } else if (x <= 19) {
            System.out.println("pack");
        } else if (x <= 249) {
            System.out.println("throng");
        } else if (x <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}