public class PondTestProgram{
	public static void main(String[] args){
		//create a pond with 10 fish
		Pond pond = new Pond(15);
		pond.add(new Fish(4, "Sunfish"));
		pond.add(new Fish(25, "Pike"));
		pond.add(new Fish(20, "Bass"));
		pond.add(new Fish(30, "Perch"));
		pond.add(new Fish(4, "Sunfish"));
		pond.add(new Fish(15, "Pike"));
		pond.add(new Fish(9, "Pike"));
		pond.add(new Fish(12,"Bass"));
		pond.add(new Fish(5, "Sunfish"));
		pond.add(new Fish(12, "Sunfish"));
		pond.listFish();
		System.out.println();

		//catch 7 random fish
		System.out.println("Catching 7 fish as follows...");
		for(int i=0;i<7;i++)
			System.out.println(pond.catchAFish());
		System.out.println();

		//show what is left in the pond
		pond.listFish();
		System.out.println();

		//try to catch 5 random fish (only 3 left)
		System.out.println("Attempting to catch 5 random fish as follows...");
		for(int i=0;i<5;i++)
			System.out.println(pond.catchAFish());
		System.out.println();

		//show what is left in the pond
		pond.listFish();

	}
}