import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n5522 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		for (int i = 0; i++ < 5;) {

			sum += Integer.parseInt(br.readLine());

		}

		System.out.println(sum);

	}

}
