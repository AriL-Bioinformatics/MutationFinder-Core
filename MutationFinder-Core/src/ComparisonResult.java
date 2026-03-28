
import java.util.List;

public class ComparisonResult {
	
	private final int comparedLength;
	private final int mismatchCount;
	private final double percentIdentity;
	private final List<Mutation> mutations;
	
	public ComparisonResult(int comparedLength, int mismatchedCount, double percentIdentity, List<Mutation> mutations) {
		this.comparedLength = comparedLength;
		this.mismatchCount = mismatchedCount;
		this.percentIdentity = percentIdentity;
		this.mutations = mutations;
	}
	
	public int getComparedLength() {
		return comparedLength;
	}
	
	public int getMismatchCount(){
		return mismatchCount;
	}
	
	public double getPercentIdentity() {
		return percentIdentity;
	}
	
	public List<Mutation> getMutations(){
		return mutations;
	}
	
}
