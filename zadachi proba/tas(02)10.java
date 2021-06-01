
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        if (x<=27) {
            System.out.println("pervi");
        }
        if (x>=28&&x<=54) {
            System.out.println("vtor");
        }
        if (x>=55&&x<=81) {
            System.out.println("tret");
        }
        if (x>=82&&x<=108) {
            System.out.println("chetvert");
        }
    }
}