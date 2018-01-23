package Class_7;

public class Class7_Animal_VedantSharma {

		String breed;
		String Colour;
		void speak() {
			System.out.println("Growl");
		}
	

	public static void main(String[] args) {
		Dog D=new Dog();
		Cat C=new Cat();
		D.breed="Labrador";
		D.Colour="Black";
		C.breed="Ront";
		C.Colour="Grey";
		
		D.speak();
		C.speak();
		
		D.colour_breed();
		C.colour_breed();
		
	}

}
