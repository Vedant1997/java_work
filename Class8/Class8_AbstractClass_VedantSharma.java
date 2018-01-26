package Class8;

import Class8.Class8_Animal_VedantSharma.Animals;

public class Class8_AbstractClass_VedantSharma {
	public static abstract class Animals{
		String breed;
		String colour;
		
		void speak() {};
		abstract void eat();
	}
	
	public static class Dogs extends Animals{

		@Override
		public void speak() {
			System.out.println("Bark");
		}

		@Override
		public void eat() {
			System.out.println("Dog is eating");
		}
		
	} 
	public static class Cats extends Animals{

		@Override
		public void speak() {
			System.out.println("Meow");
		}

		@Override
		public void eat() {
			System.out.println("cat is eating");
		}
		
	}

	public static void main(String[] args) {
		
	}

}
