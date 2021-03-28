import java.util.Scanner;
/** 
 * @author zuy
 */
public class Int2Bin {
	/* Convert integer 16 bits into binary bit pattern */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[!] Enter the integer: ");
		int n = sc.nextInt();
		
		System.out.print("[*] Binary bit pattern: ");
		byte[] bitPattern = new byte[16];
		int lenBit = bitPattern.length;
		for (int i = lenBit - 1; i >= 0; --i) {
			bitPattern[i] = (byte)(n >> (lenBit - 1 - i) & 1);
		};
		
		for (byte bit: bitPattern) {
			System.out.print(bit);
		};
		
		sc.close();
	}
}
