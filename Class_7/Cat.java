package Class_7;

public class Cat extends Class7_Animal_VedantSharma{
	void speak() {
		System.out.println("Meow");
		super.speak();
	}
	void colour_breed() {
		System.out.println("Colour :"+this.Colour+" Breed :"+this.breed);
	}
}