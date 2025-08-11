package labsession;

class Animals {
	
		void makesound() {
			System.out.println("Animal makes a sound");
		}
	}
class Cat extends Animals {
		void makeSound() {
			System.out.println("Cat barks");
		}




		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Cat cat = new Cat();
			cat.makesound();
		}
	}


