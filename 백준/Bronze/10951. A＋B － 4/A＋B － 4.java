import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a, b;
		while(in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println((a + b));
		}
	}
}