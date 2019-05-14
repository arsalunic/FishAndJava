public class Fish{
	//attributes
	private int size;
	private String species; 

	// This is the zero-parameter constructor
	public Fish() {
		size = 0;
		species = "UNKNOWN";
	}

	// This is a 4-parameter constructor
	public Fish(int s, String p) {
		size = s;
		species = p;
	}

	// These are the get methods
	public int getSize() { return this.size; }
	public String getSpecies() { return this.species; }

	// This returns a string representing the size and specy of the fish
	public String toString() {
		return "A "+ size + "cm " + species;
	}
}