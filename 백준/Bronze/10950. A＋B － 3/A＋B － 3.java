import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a, b, t = in.nextInt();

		for(int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a + b);
		}
	}
}