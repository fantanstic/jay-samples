
class Dog{
	int size;
	String beed;
	String name;
	void bark(){

		System.out.println("ruff ruff!");
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Dog dog =new Dog();
		dog.size =40;
		dog.bark();
	}
}
