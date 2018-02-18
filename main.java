package main;

public class main {
	public static void main(String[] args) {
	Shovel Pinch = new Shovel(1.5,"Pinch",2,"plastic",150);
	
	Shovel Scoop = new Shovel(0.1,"Scoop",0.8,"oak",50);
	
	Shovel Sapper = new Shovel(0.5,"Sapper",1,"iron",200);
	
	System.out.println(Pinch.toString());
	
	System.out.println(Scoop.toString());
	
	System.out.println(Sapper.toString());

	Shovel.printStaticSum();
	Pinch.printSum();
	}
}
