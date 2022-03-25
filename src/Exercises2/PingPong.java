package Exercises2;

public class PingPong {
    public static void main(String[] args) {

        int start = 1;

        while (start <= 100) {
            if (start % 6 == 0) {
                System.out.println(" Ping Pong ");
            } else if (start % 3 == 0) {
                System.out.println((" Pong "));
            } else if (start % 2 == 0) {
                System.out.println(" Ping ");
            } else {
                System.out.println("-");
            }
            start++;
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println(" Ping Pong ");
            } else if (i % 3 == 0) {
                System.out.println((" Pong "));
            } else if (i % 2 == 0) {
                System.out.println(" Ping ");
            } else {
                System.out.println("-");
            }
        }
    }
}
