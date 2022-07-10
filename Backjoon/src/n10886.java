import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10886 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cute = 0;
		int not_cute = 0;
		for (int i = 0; i++ < N;) {
			if (Integer.parseInt(br.readLine()) == 1)
				cute++;
			else
				not_cute++;
		}

		if (cute > not_cute)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");

	}

}
