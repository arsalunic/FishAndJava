public class FishingTestProgram{
	public static void main(String[] args){
		//create a big pond with 15 fish
		Pond   bigPond = new Pond(15);
		bigPond.add(new Fish(4, "Sunfish"));
		bigPond.add(new Fish(25, "Pike"));
		bigPond.add(new Fish(20, "Bass"));
		bigPond.add(new Fish(30, "Perch"));
		bigPond.add(new Fish(14, "Sunfish"));
		bigPond.add(new Fish(15, "Pike"));
		bigPond.add(new Fish(9, "Pike"));
		bigPond.add(new Fish(12, "Bass"));
		bigPond.add(new Fish(5, "Sunfish"));
		bigPond.add(new Fish(12, "Sunfish"));
		bigPond.add(new Fish(10, "Bass"));
		bigPond.add(new Fish(2, "Bass"));
		bigPond.add(new Fish(16, "Perch"));
		bigPond.add(new Fish(30, "Sunfish"));
		bigPond.add(new Fish(7, "Perch"));
		bigPond.listFish();

		//create two people to fish in the pond
		Fisher suzy = new Fisher("Suzy", 10);
		Fisher fred = new Fisher("Fred", 15);

		System.out.println("First, Suzy catches 20 fish in the big pond...");
		for(int i =0;i<20;i++)
			suzy.goFishing(bigPond);
		suzy.listFish();

		System.out.println("Next, Fred catches 20 fish in the big pond...");
		for(int i =0;i<20;i++)
			fred.goFishing(bigPond);
		fred.listFish();

		System.out.println("Here's what's left of the pond ...");
		bigPond.listFish();
	}
}