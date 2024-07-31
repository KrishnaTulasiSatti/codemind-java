import java.util.Scanner;
public class Taps {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int res = (a*b)/(a+b);
        System.out.println(res);
    }
}