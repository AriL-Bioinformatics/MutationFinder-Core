
public class Mutation {
	private final int position;
	private final char ref;
	private final char alt;
	
	public Mutation(int position, char ref, char alt) {
		this.position = position;
		this.ref = ref;
		this.alt = alt;
	}
	
	public int getPosition() {
		return position;
	}
	
	public char getRef() {
		return ref;
	}
	
	public char getAlt() {
		return ref;
	}
	
	@Override
	public String toString() {
		return position + "; " + ref + "-->" + alt;
	}
}
