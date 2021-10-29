package JavaLabPractical;


	class Bike{
		int bikeNo;
		String bikeName;
		float bikePrice;
		Bike(int bikeNo,String bikeName, float bikePrice){
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		}
		void display()
		{
		System.out.println(bikeNo + " " + bikeName + " Rs." + bikePrice);
		}
		
		public static void main(String[] args){
		Bike b = new Bike(4262, "FZS", 260000f);
		b.display();
		}
		}


		//2. Program using super keyword
		class Animal{
		String color= "red";
		}

		class Parrot extends Animal{
		String color = "Green";
		void printColor(){
		System.out.println("Parrot color: " + color); // prints color of Parrot
		System.out.println("Animal color: " + super.color); //prints color of animal
		}
		}

		public class qn39{
		public static void main(String[] args){
		Parrot r = new Parrot();
		r.printColor();
		}
}
