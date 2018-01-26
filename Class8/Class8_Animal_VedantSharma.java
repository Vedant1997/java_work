package Class8;


public class Class8_Animal_VedantSharma {
	public interface Animals{
		void speak();
		void eat();
	}
	
	public static class Dogs implements Animals{

		@Override
		public void speak() {
			System.out.println("Bark");
		}

		@Override
		public void eat() {
			System.out.println("Dog is eating");
		}
		
	} 
	public static class Cats implements Animals{

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
		Dogs D=new Dogs();
		Cats C=new Cats();
		D.speak();
		D.eat();
		C.speak();
		C.eat();
	}

}
