public class Fisher {
	
	//atributes
	public static final int LIMIT = 3;
	private String name;
	private Fish[] fishCaught = new Fish[LIMIT];
	private int numFishCaught;
	private int keepSize;

	//constructor
	public Fisher(String name, int keepSize) {
		this.name = name;
		this.keepSize = keepSize;
	}

	//getMethods
	public String getName() { return name; }
	public Fish[] getFishCaught(){ return fishCaught; }
	public int getNumFishCaught() { return numFishCaught; }
	public int getKeepSize() { return keepSize; }

	//toString method
	public String toString() {
		return (name + " with " + numFishCaught + " fish");
	}

	//keep() method
	public void keep(Fish f) {
		if (numFishCaught == LIMIT) {
		} 
		else {
			numFishCaught++;
			fishCaught[numFishCaught-1] = f;
		}
	}

	//boolean likes() method
	boolean likes(Fish f) {
		if ((f.getSize() >= keepSize) && !(f.getSpecies().equalsIgnoreCase("Sunfish"))) {
			return true;
		}
		return false; 
	}

	//listFish() method
	public void listFish(){
		System.out.println(name + " with " + numFishCaught + " as follows: ");
		for (int i = 0; i<numFishCaught; i++){
			Fish f = (getFishCaught())[i];
			System.out.println("A " + f.getSize() + " cm " + f.getSpecies());
		}
	}

	//goFishing() method
	public void goFishing(Pond p) {
		Fish f = p.catchAFish();
		if (f != null) {
			if (likes(f))
				if (numFishCaught < Fisher.LIMIT)
					keep(f);
			if (!likes(f) || numFishCaught >= Fisher.LIMIT)
				p.add(f);
		}
	}
}