// Polymorphism Example
abstract class Person{
	void behave(){

	}
}
class Student extends Person{
	void behave(){
		System.out.println("Behave like student");
	}
}

class Son extends Person{
	void behave(){
		System.out.println("Behave like son");
	}
}

class Customer extends Person{
	void behave(){
		System.out.println("Behave like Customer");
	}
}

public class main {
	static void perform(Person p){
		p.behave();

	}
	public static void main(String[] args) {
		perform(new Student());
		perform(new Son());
	}
	
}



// // Interface was used here
// interface Storage{
// 	void load();
// 	void store();
// 	void display();
// }

// class FileStorage implements Storage{
// 	public void load(){
// 		System.out.println("load from filesystem");
// 	}
// 	public void store(){
// 		System.out.println("Store inside filesystem");
// 	}
// 	public void display(){
// 		System.out.println("Display from filesystem");
// 	}
// }

// class DatabaseSystem implements Storage{
// 	public void load(){
// 		System.out.println("Load inside database");
// 	}
// 	public void display(){
// 		System.out.println("Display inside database");
// 	}
// 	public void store(){
// 		System.out.println("Store inside database");
// 	}
// }

// public class main {
// 	static void perform(Storage ref){
// 		ref.load();
// 		ref.store();
// 		ref.display();
// 	}
// 	public static void main(String[] args) {
// 		perform(new FileStorage());
// 		perform(new DatabaseSystem());
// 	}
// }


// We use the abstract class here
// abstract class UIComponentCreator
// {
// 	abstract void createComponent();    // contract
// 	void showComponent()  // concrete behaviour
// 	{
// 		System.out.println("let's show component inside the given window");
// 	}
// }
// class WindowsUIComponentCreator extends UIComponentCreator
// {
// 	void createComponent()
// 	{
// 		System.out.println("create component as per Windows platform");
// 	}
// }

// class MacUIComponentCreator extends UIComponentCreator
// {
// 	void createComponent()
// 	{
// 		System.out.println("create component as per Mac platform");
// 	}
// }
// public class main {
// 	static void perform(UIComponentCreator ref){
// 		ref.createComponent();
// 		ref.showComponent();
// 	}
// 	public static void main(String[] args) {
// 		perform(new WindowsUIComponentCreator());
// 		perform(new MacUIComponentCreator());
// 	}	
// }


//We did the inheritance in this example
// class Animal
// {
// 	void makeSound()
// 	{
// 	}
// }
// class Tiger extends Animal
// {
// 	void makeSound()    // overriding makeSound() of Animal
// 	{
// 		System.out.println("roar");
// 	}
// 	void hunting(){
// 		System.out.println("TIger is Hunting");
// 	}
// }
// class Dog extends Animal
// {
// 	void makeSound()  // overriding makeSound() of Animal
// 	{
// 		System.out.println("bark");
// 	}
// }
// class Cat extends Animal
// {
// 	void makeSound()   // overriding makeSound() of Animal
// 	{
// 		System.out.println("meow");
// 	}
// }
// public class main
// {
// 	static void perform(Animal ref){
// 		ref.makeSound();
// 		if (ref instanceof Tiger) {
// 			Tiger t = (Tiger) ref;
// 			t.hunting();
// 		}

// 	}

// 	public static void main(String[] args) {
// 		perform(new Cat());
// 		perform(new Tiger());
// 	}
// }
