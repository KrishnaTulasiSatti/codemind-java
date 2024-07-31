import java.util.Scanner;
public class Loss {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        double res = (a-b)*100.0/a;
        System.out.printf("%.2f",res);
    }
}