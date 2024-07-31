import java.util.Scanner;
public class Frames {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        System.out.println((2*(a+b))*c);
    }
}