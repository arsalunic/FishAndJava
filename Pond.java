public class Pond {
	//attributes
	private Fish[] fish;
	private int numFish;

	//a constructor that takes the capacity of the pond.
	public Pond(int capacity) {
		fish = new Fish[capacity];
		numFish = 0;
	}

	//getMethod for numFish attribute
	public int getNumFish() {
		return numFish;
	}

	//a method which returns a boolean whether pond has reached its capacity.
	public boolean isFull() {
		return numFish == fish.length;
	}

	//toString method
	public String toString() {
		return "A Pond With "+ this.numFish + " fish";
	}

	//add() method which takes a single Fish and adds to the Pond
	public void add(Fish f) {
		if (!isFull()){
			fish[numFish++] = f;
		}     
	}

	//listFish() methos which lists all the fish in the pond
	public void listFish() {
		System.out.println(String.format("Pond with %d fish as follows:", numFish));
		for (Fish f : fish){
			if(f != null){
				System.out.println(f.toString());
			}
		}
	}

	//catchAFish() method which returns a random fish from the pond
	public Fish catchAFish() {
		if (numFish > 0) {
			int randIndex =  (int)(Math.random() * fish.length);
			while (fish[randIndex] == null)
				randIndex =  (int)(Math.random() * fish.length);

			Fish randomFish = fish[randIndex];
			fish[randIndex] = fish[numFish-1];
			fish[--numFish] = null;
			return randomFish;
		}
		return null;
	}
}