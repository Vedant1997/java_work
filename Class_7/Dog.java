package Class_7;



public class Dog extends Class7_Animal_VedantSharma{
	void speak() {
		System.out.println("Bark");
		super.speak();
	}
	void colour_breed() {
		System.out.println("Colour :"+this.Colour+" Breed :"+this.breed);
	}
}
