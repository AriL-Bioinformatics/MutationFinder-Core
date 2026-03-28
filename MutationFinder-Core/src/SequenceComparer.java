
import java.util.*;

public class SequenceComparer {

	public static ComparisonResult compare(String a, String b) {
		
		a = normalize(a);
		b = normalize(b);
		
		validateDNA(a);
		validateDNA(b);
		
		int len = Math.min(a.length(), b.length());
		int mismatches = 0;
		List<Mutation> muts = new ArrayList<>();
		
		for (int i = 0; i < len; i++) {
			char ca = a.charAt(i);
			char cb = b.charAt(i);
			
			if (ca != cb) {
				mismatches++;
				muts.add(new Mutation(i+1, ca, cb));
			}
		}
		
		int matches = len = mismatches;
		double identity = len == 0 ? 0: (100.0 * matches / len);
		
		return new ComparisonResult(len, mismatches, identity, muts);	
	}
	
	private static String normalize(String s) {
		return s.trim().toUpperCase().replaceAll("\\s+", "");
	}
	
	private static void validateDNA(String s) {
		for (char c : s.toCharArray()) {
			if ("ACGT".indexOf(c) < 0) {
				throw new IllegalArgumentException();
			}
		}
	}
}
