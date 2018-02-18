package lab1lopata;

public class lopata {
	private String name;
	private double material;
	private double size;
	private double weight;
	private int amount;
	private static int totalAmount = 0;
	
	public lopata() {
		
	}
	
	public lopata(String name,double material,double size,double weight){
		setName(name);
		setMaterial(material);
		setSize(size);
		setWeight(weight);
		
	}
	public lopata(String name, double material, double weight, double size, int amount) {
		setName(name);
		setMaterial(material);
		setWeight(weight);
		setSize(size);
		setAmount(amount);

}
	public String toString() {
		return "Info about lopata: \nname: " + getName() 
				+ "\nprice: " + getMaterial() 
				+ "\nsize: " + getSize() 
				+ "\nweight: " + getWeight() 
				+ "\namount: " + getAmount()
				+ "\n";	
	}
	public static void printStaticSum() {
		System.out.print("Amount of all lopats are " + totalAmount + " euro\n");
	}
	
	public void printSum() {
		System.out.println("Amount of the lopata " + getName() + " is " + getAmount() + " euro\n");
	}
	
	public void resetValues(String name, double material, double size, double weight, int amount) {
		setName(name);
		setMaterial(material);
		setSize(size);
		setWeight(weight);
		setAmount(amount);
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaterial() {
		return material;
	}

	public void setMaterial(double material) {
		this.material = material;
	}
	
	public int getAmount(){ 
		return amount;
	}
	
	public void setAmount( int amount){
		totalAmount -= this.amount;
		totalAmount += amount;
		this.amount = amount;
	}
}
