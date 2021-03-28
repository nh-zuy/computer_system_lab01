import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author zuy
 */
public class Bin2Int {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));

			String line = br.readLine().replace(" ", "");

			System.out.println("[!] Bit pattern from file: " + line);

			String[] bitPattern = line.split("");
			int lenBit = bitPattern.length;
			int n = 0;
			for (int i = lenBit - 1; i >= 0; --i) {
				n = n | (Integer.parseInt(bitPattern[i]) << (lenBit - 1 - i));
			};

			System.out.println("[*] Output: " + n);
			br.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}


