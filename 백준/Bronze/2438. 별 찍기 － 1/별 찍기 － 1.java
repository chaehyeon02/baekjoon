import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String star = "*";
		for(int i = 0; i < n; i++) {
			System.out.println(star);
			star += "*";
		}
	}
}