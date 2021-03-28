/**
 * 
 * @author zuy
 *
 */
public class Limit {
	/* Return the range of primitive type value */
	
	/*
	 * Max/Min of UNSIGNED CHAR (8 bits)
	 */
	public static int maxUnsignedChar() {
		int[] bitPattern = new int[8];
		int lenBit = bitPattern.length;
		
		for (int i = 0; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return n;
		
	}
	
	public static int minUnsignedChar() {
		int[] bitPattern = new int[8];
		int lenBit = bitPattern.length;
		
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return n;
	}
	
	/*
	 * Max/Min of CHAR (8 bits)
	 */
	public static int maxChar() {
		int[] bitPattern = new int[8];
		int lenBit = bitPattern.length;
		
		for (int i = 0; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		bitPattern[0] = 0;
		
		int n = 0;
		for (int i = lenBit - 1; i >= 1; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	public static int minChar() {
		int[] bitPattern = new int[8];
		int lenBit = bitPattern.length;
		
		bitPattern[0] = 1;

		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	/*
	 * Max/Min of UNSIGNED SHORT (16 bits)
	 */
	public static int maxUnsignedShort() {
		int[] bitPattern = new int[16];
		int lenBit = bitPattern.length;
		
		for (int i = 0; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return n;
	}
	
	public static int minUnsignedShort() {
		int[] bitPattern = new int[16];
		int lenBit = bitPattern.length;
		
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return n;
	}
	
	/*
	 * Max/Min of SHORT (16 bits)
	 */
	public static int maxShort() {
		int[] bitPattern = new int[16];
		int lenBit = bitPattern.length;
		
		for (int i = 1; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		bitPattern[0] = 0;
		
		int n = 0;
		for (int i = lenBit - 1; i >= 1; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	public static int minShort() {
		int[] bitPattern = new int[16];
		int lenBit = bitPattern.length;
		
		bitPattern[0] = 1;
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((bitPattern[i]) << (lenBit - 1 - i));
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	/*
	 * Max/Min of UNSIGNED INT (32 bits)
	 */
	public static long maxUnsignedInt() {
		int[] bitPattern = new int[32];
		int lenBit = bitPattern.length;
		
		for (int i = 0; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		long n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= ((long)bitPattern[i] << (lenBit - 1 - i));
		};
		
		return n;
	}
	
	public static int minUnsignedInt() {
		int[] bitPattern = new int[32];
		int lenBit = bitPattern.length;
		
		int n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= bitPattern[i] << (lenBit - 1 - i);
		};
		
		return n;
	}
	
	/*
	 * Max/Min of INT (32 bits)
	 */
	public static int maxInt() {
		int[] bitPattern = new int[32];
		int lenBit = bitPattern.length;
		
		bitPattern[0] = 0;
		for (int i = 1; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		int n = 0;
		for (int i = lenBit - 1; i >= 1; --i) {
			n |= bitPattern[i] << (lenBit - 1 - i);
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	public static int minInt() {
		 int[] bitPattern = new int[32];
		 int lenBit = bitPattern.length;
			
		 bitPattern[0] = 1;
			
		 int n = 0;
		 for (int i = lenBit - 1; i >= 0; --i) {
			 n |= bitPattern[i] << (lenBit - 1 - i);
		 };
			
		 return (bitPattern[0] == 0) ? n : (-n);
	 }
	
	/*
	 * Max/Min of UNSIGNED LONG (64 bits)
	 */
	public static long maxUnsignedLong() {
		int[] bitPattern = new int[64];
		int lenBit = bitPattern.length;
		
		for (int i = 0; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		long n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= bitPattern[i] << (lenBit - 1 - i);
		};
		
		return n;
	}
	
	public static long minUnsignedLong() {
		int[] bitPattern = new int[64];
		int lenBit = bitPattern.length;
		
		long n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= bitPattern[i] << (lenBit - 1 - i);
		};
		
		return n;
	}
	
	/*
	 * Max/Min of LONG (64 bits)
	 */
	public static long maxLong() {
		int[] bitPattern = new int[64];
		int lenBit = bitPattern.length;
		
		bitPattern[0] = 0;
		for (int i = 1; i < lenBit; ++i) {
			bitPattern[i] ^= 1;
		};
		
		long n = 0;
		for (int i = lenBit - 1; i > 0; --i) {
			n |= (long)bitPattern[i] << (lenBit - i - 1);
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	public static long minLong() {
		int[] bitPattern = new int[64];
		int lenBit = bitPattern.length;
		
		bitPattern[0] = 1;
		
		long n = 0;
		for (int i = lenBit - 1; i >= 0; --i) {
			n |= (long)bitPattern[i] << (lenBit - i - 1);
		};
		
		return (bitPattern[0] == 0) ? n : (-n);
	}
	
	/*
	 * Max/min of float (32 bits)
	 */
	public static double maxFloat() {
		int[] bitPattern = new int[32];
		int lenBit = bitPattern.length;
		int K = 127;
		
		bitPattern[0] = 0;
		for (int bit = 1; bit < lenBit; ++bit) {
			bitPattern[bit] ^= 1;
		};
		bitPattern[8] = 0;
	
		int E = 0;
		for (int bit = 1; bit <= 8; ++bit) {
			E |= bitPattern[bit] << (8 - bit);
		};
		E = E - K;
		
		double S = 1;
		for (int bit = 9; bit < lenBit; ++bit) {
			S = S + bitPattern[bit] * Math.pow(2, 8 - bit); 
		};
		
		return S * Math.pow(2, E);
	}
	public static double minFloat() {
		return maxFloat() * (-1.0);
	}
	
	/*
	 * Max/min of DOUBLE (64 bits)
	 */
	public static double maxDouble() {
		int[] bitPattern = new int[64];
		int lenBit = bitPattern.length;
		int K = 1023;
		
		bitPattern[0] = 0;
		for (int bit = 1; bit < lenBit; ++bit) {
			bitPattern[bit] ^= 1;
		};
		bitPattern[11] = 0;
	
		int E = 0;
		for (int bit = 11; bit > 0; --bit) {
			E |= bitPattern[bit] << (11 - bit);
		};
		
		E = E - K;
		
		double S = 1;
		for (int bit = 12; bit < lenBit; ++bit) {
			S = S + bitPattern[bit] * Math.pow(2, 11 - bit); 
		};
		
		return S * Math.pow(2, E);
	}
	
	public static double minDouble() {
		return maxDouble() * (-1.0);
	}
	
	
	public static void main(String[] args) {
		System.out.println("[*] Unsigned char (8 bits)");
		System.out.println("\tMaximum: " + maxUnsignedChar());
		System.out.println("\tMinimum: " + minUnsignedChar());
		
		System.out.println("[*] Char (8 bits)");
		System.out.println("\tMaximum: " + maxChar());
		System.out.println("\tMinimum: " + minChar());
		
		System.out.println("[*] Unsigned Short (16 bits)");
		System.out.println("\tMaximum: " + maxUnsignedShort());
		System.out.println("\tMinimum: " + minUnsignedShort());
		
		System.out.println("[*] Short (16 bits)");
		System.out.println("\tMaximum: " + maxShort());
		System.out.println("\tMinimum: " + minShort());
		
		System.out.println("[*] Unsigned Integer (32 bits)");
		System.out.print("\tMaximum: "); System.out.format("%,8d%n", maxUnsignedInt());
		System.out.print("\tMinimum: ");  System.out.format("%,8d%n", minUnsignedInt());
		
		System.out.println("[*] Integer (32 bits)");
		System.out.print("\tMaximum: "); System.out.format("%,8d%n", maxInt());
		System.out.print("\tMinimum: "); System.out.format("%,8d%n", minInt());
		
		System.out.println("[*] Unsigned Long (64 bits)");
		System.out.println("\tMaximum: 18,446,744,073,709,551,615");
		System.out.println("\tMinimum: " + minUnsignedLong());
		
		System.out.println("[*] Long (64 bits)");
		System.out.print("\tMaximum: "); System.out.format("%,8d%n", maxLong());
		System.out.print("\tMinimum: "); System.out.format("%,8d%n", minLong());
		
		System.out.println("[*] Float (32 bits)");
		System.out.print("\tMaximum: "); System.out.printf("%.3e%n", maxFloat());
		System.out.print("\tMinimum: "); System.out.printf("%.3e%n", minFloat());
		
		System.out.println("[*] Double (64 bits)");
		System.out.print("\tMaximum: "); System.out.printf("%.3e%n", maxDouble());
		System.out.print("\tMinimum: "); System.out.printf("%.3e%n", minDouble());
	}
}
