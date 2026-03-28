
public class Main {

	public static void main(String[] args) {
		
		String seqA = "ATCGTAC";
		String seqB = "ATGGTAC";
		
		ComparisonResult r = SequenceComparer.compare(seqA, seqB);
		
		System.out.println("Compared length: " + r.getComparedLength());
		System.out.println("Mismatches: " + r.getMismatchCount());
		System.out.printf("Percent identity: %.2f%%\n", r.getPercentIdentity());
		
		System.out.println("\nMutations: ");
		
		r.getMutations().forEach(System.out::println);

	}

}
